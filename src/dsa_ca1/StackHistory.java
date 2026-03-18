package dsa_ca1;

import java.util.ArrayList;

/**
 *
 * References: Moodle notes and sample code provided by Hamilton on creating a stack
 * https://moodle2025.ncirl.ie/course/view.php?id=45
 */
public class StackHistory implements StackInterface {
    private ArrayList<String> theStack;

    /**
     * Creates a new instance of Stack
     */
    public StackHistory() {
        theStack = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    /**
     * removes the item from the TOP (first position) of the stack and returns
     * it
     */
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts/inserts an item onto the TOP (first position) of the stack
     */
    public void push(Object newItem) {
        theStack.add(0, (String) newItem);
    }

    public int size() {
        return theStack.size();
    }
}
