package dsa_ca1;

/**
 *
 * References: Moodle notes and sample code provided by Hamilton on creating a queue interface
 * https://moodle2025.ncirl.ie/course/view.php?id=45
 */
public interface QueueInterface {
    public boolean isEmpty();

    public int size();

    public void enqueue(Object element);

    public Object dequeue();
}
