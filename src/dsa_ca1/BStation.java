/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_ca1;

/**
 *
 * @author yaros
 */
public class BStation {
    
    private String stationName;
    private QueueStation queue;
    private StackHistory stack;
    
    public BStation(String stationName) {
        this.stationName = stationName;
        this.queue = new QueueStation();
        this.stack = new StackHistory();
    }
    
    public QueueStation getQueue() {
        return queue;
    }
    
    public StackHistory getStack() {
        return stack;
    }
    
    @Override
    public String toString() {
        return stationName;
    }
    
}
