package Table;

import java.util.ArrayList;


/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry>entries;

    public Table() {
        this.entries = new ArrayList();
    }

    public void put(K key, V value) {
        for (Integer j = 0; j < this.entries.size();j++){
            Entry entry = this.entries.get(j);
            if (entry.getKey().equals(key)){
               entry.setValue(value);
               return;
            }
        }
        this.entries.add(new Entry(key, value));
    }

    public V get(K foo) {
        for (Integer i =0; i < this.entries.size();i++){
            Entry valueOfI = this.entries.get(i);
            if (valueOfI.getKey().equals(foo)){
                return (V) valueOfI.getValue();
            }
        }
        return null;

    }

    public void remove(K foo) {
        for (Integer i =0;  i < this.entries.size();i++){
            Entry valueOfI = this.entries.get(i);
            if (valueOfI.getKey().equals(foo));
            this.entries.remove(valueOfI);

        }
    }
}
