package dsa_ca1;

/**
 *
 * References: Moodle notes and sample code provided by Hamilton on creating a stack interface
 * https://moodle2025.ncirl.ie/course/view.php?id=45
 */
public interface StackInterface {
    public boolean isEmpty();

    public void push(Object newItem);

    public Object pop();

    public int size();
}
