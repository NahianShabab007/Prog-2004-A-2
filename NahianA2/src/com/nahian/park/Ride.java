package com.nahian.park;

import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee operator;

    private Queue<Visitor> visitorQueue;          // Queue for visitors
    private LinkedList<Visitor> rideHistory;      // History of visitors who took the ride

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.capacity = 0;
        this.operator = null;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, int capacity, Employee operator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // Implementing RideInterface methods

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);  // Add to queue
        System.out.println(visitor.getName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removedVisitor = visitorQueue.poll();  // Remove from queue
            System.out.println(removedVisitor.getName() + " removed from the queue.");
        } else {
            System.out.println("Queue is empty. No visitor to remove.");
        }
    }

    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Visitors in queue:");
            for (Visitor visitor : visitorQueue) {
                System.out.println(" - " + visitor.getName());
            }
        }
    }

    @Override
    public void runOneCycle() {
        // Placeholder: Implementation in Part 5
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Visitors who took the ride:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }
}
