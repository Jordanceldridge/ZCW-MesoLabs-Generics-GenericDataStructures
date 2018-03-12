package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        this.elements =  new Object[0];

    }

    public boolean isEmpty() {
        if (this.elements.length == 0){
            return true;
        }
        return false;
    }

    public void push(E foo) {
        Object[] temp = Arrays.copyOf(this.elements,this.elements.length +1);
        temp[temp.length - 1] = foo;
        this.elements = temp;

    }

    public Object pop() {
        Object var =  this.elements[this.elements.length -1];
        this.elements = Arrays.copyOf(this.elements,this.elements.length -1);

        return var;
    }
}
