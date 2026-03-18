package dsa_ca1;

/**
 *
 * References: Moodle notes and sample code provided by Hamilton on creating a single linked list node system
 * https://moodle2025.ncirl.ie/course/view.php?id=45
 */
public class SingleLinkedListNode {

    private Object element;
    private SingleLinkedListNode next;

    public SingleLinkedListNode(Object inElement, SingleLinkedListNode inNode) {
        element = inElement;
        next = inNode;
    }

    public SingleLinkedListNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedListNode inNode) {
        next = inNode;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
        element = inElement;
    }

    public String toString() {
        return element.toString();
    }
}
