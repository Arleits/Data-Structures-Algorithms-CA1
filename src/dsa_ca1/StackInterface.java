/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dsa_ca1;

/**
 *
 * @author yaros
 * References: Moodle notes and sample code provided by Hamilton
 * https://moodle2025.ncirl.ie/course/view.php?id=45
 */
public interface StackInterface {
    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();
}
