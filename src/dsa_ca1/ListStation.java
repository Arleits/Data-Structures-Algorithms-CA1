package dsa_ca1;

/**
 *
 * @author yaros
 * References: Moodle notes and sample code provided by Hamilton
 * https://moodle2025.ncirl.ie/course/view.php?id=45
 */
public class ListStation {
    
    // Single linked list methods provided by Hamilton from moodle
    private SingleLinkedListNode head;
    private int iSize, counter;
    private SingleLinkedListNode currNode;
    private SingleLinkedListNode prevNode;

    public ListStation() {
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }

    //@Override
    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    //@Override
    public int size() {
        return iSize;
    }

    //add an element to the list, assume the iPosition is in the correct range
    //@Override
    public void add(int iPosition, Object theElement) {
        //special case of adding at the head of the list (on the first position)
        if (iPosition == 1) {
            SingleLinkedListNode newNode = new SingleLinkedListNode(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            SingleLinkedListNode newNode = new SingleLinkedListNode(theElement, currNode);
            prevNode.setNext(newNode);
        }
        //as a new one was added the size counter must be incremented by 1
        iSize = iSize + 1;
    }

    //add an element at the end of the list (on the last position)
    //@Override
    public void add(Object theElement) {
        SingleLinkedListNode newNode = new SingleLinkedListNode(theElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    // Gets the specific station element to be able to call the stations specific bike queue and bike stack history
    //@Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode.getElement();
    }

    //@Override
    public void remove(int iPosition) {
        // special case for removing the head of the list / first node.
        if (iPosition == 1) {
            head = head.getNext();
        } else {
            // find the previous and current nodes
            setCurrent(iPosition);
            prevNode.setNext(currNode.getNext());
        }
        // as one node was removed the size counter must be decremented by 1
        iSize = iSize - 1;
    }

    private void setCurrent(int iPosition) {
        // sets currNode to the node at position specified by index
        // sets prevNode to the node previous to currNode
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    // printlist() method prints out the content of the list  
    // Modified printlist method to work with netbeans GUI elements
    // Creates a outputText string to store the lists contents and wraps it around in HTML to use line breaks
    //@Override
    public String printList() {
        counter = 1;
        String outputText = "<html>";
        SingleLinkedListNode tempNode = head;
        while (tempNode != null) {
            outputText = outputText + counter + ": " + tempNode.toString() + "<br>";
            tempNode = tempNode.getNext();
            counter ++;
        }
        outputText = outputText + "</html>";
        return outputText;
    }
}
