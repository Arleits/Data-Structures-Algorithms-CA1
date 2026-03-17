/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca1;

import java.util.ArrayList;

/**
 *
 * @author yaros
 * References: Moodle notes and sample code provided by Hamilton
 * https://moodle2025.ncirl.ie/course/view.php?id=45
 */
public class QueueStation implements QueueInterface {
    private ArrayList<String> theQueue;

    /* Creates a new instance of MyQueue class */
    public QueueStation() {
        theQueue = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    public int size() {
        return theQueue.size();
    }

    public Object frontElement() {
        if (theQueue.size() > 0) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(Object element) {
        theQueue.add((String) element);
    }

    public Object dequeue() {
        if (theQueue.size() > 0) {
            return theQueue.remove(0);
        } else {
            return null;
        }
    }
}
