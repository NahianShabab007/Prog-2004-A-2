package com.nahian.park;

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);       // Add a visitor to the queue
    void removeVisitorFromQueue();                // Remove a visitor from the queue
    void printQueue();                            // Print queue details
    void runOneCycle();                           // Run one ride cycle
    void addVisitorToHistory(Visitor visitor);    // Add a visitor to the ride history
    boolean checkVisitorFromHistory(Visitor visitor); // Check if a visitor is in the ride history
    int numberOfVisitors();                       // Return the number of visitors in the history
    void printRideHistory();                      // Print the ride history
}
