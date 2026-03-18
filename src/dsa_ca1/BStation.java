package dsa_ca1;

/**
 *
 * @author yaros
 */
// Station object class BStation made for each station object to contain its own stack and queue
// This allows each station to have its own bike queue and its own history without sharing the same queue/stack with other stations
public class BStation {
    
    // Variables/Objects
    private String stationName;
    private QueueStation queue;
    private StackHistory stack;
    
    // Contructor
    public BStation(String stationName) {
        this.stationName = stationName;
        this.queue = new QueueStation();
        this.stack = new StackHistory();
    }
    
    // Getters. Allowing us to call a specific stations queue or stack
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
