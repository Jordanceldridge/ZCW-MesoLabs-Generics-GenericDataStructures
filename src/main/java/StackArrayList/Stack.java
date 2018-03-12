package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;


    public Stack() {
        this.elements = new ArrayList<E>();


    }

    public void push(E foobar) throws Exception {
        this.elements.add(foobar);
    }

    public E pop() throws Exception {
        this.elements.get(this.elements.size()-1);
        E tempVariable = (E) this.elements.get(this.elements.size()-1);
        elements.remove(tempVariable);
        return tempVariable;
    }

    public boolean isEmpty() throws Exception {
        if (this.elements.size() == 0){
            return true;
        }
        return false;
    }
}
