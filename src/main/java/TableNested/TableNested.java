package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Table.Entry>entries;

    public TableNested() {
        this.entries = new ArrayList();
    }

    public void put(K key, V value) {
        for (Integer j = 0; j < this.entries.size();j++){
            Table.Entry entry = this.entries.get(j);
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        this.entries.add(new Table.Entry(key, value));
    }

    public V get(K foo) {
        for (Integer i =0; i < this.entries.size();i++){
            Table.Entry valueOfI = this.entries.get(i);
            if (valueOfI.getKey().equals(foo)){
                return (V) valueOfI.getValue();
            }
        }
        return null;

    }

    public void remove(K foo) {
        for (Integer i =0;  i < this.entries.size();i++){
            Table.Entry valueOfI = this.entries.get(i);
            if (valueOfI.getKey().equals(foo));
            this.entries.remove(valueOfI);

        }

    }
    public class Entry<K, V>  {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}



