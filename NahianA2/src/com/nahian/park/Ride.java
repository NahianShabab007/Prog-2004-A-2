package com.nahian.park;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee operator;

    private Queue<Visitor> visitorQueue;          // Queue for visitors
    private LinkedList<Visitor> rideHistory;      // History of visitors who took the ride
    private int maxRider;                         // Maximum riders per cycle
    private int numOfCycles;                      // Number of cycles the ride has run

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.capacity = 0;
        this.operator = null;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    // Parameterized constructor
    public Ride(String rideName, int capacity, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = Math.max(1, maxRider); // Ensure at least 1 rider per cycle
        this.numOfCycles = 0;
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
    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = Math.max(1, maxRider);
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    // Implementing RideInterface methods

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removedVisitor = visitorQueue.poll();
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
        if (operator == null) {
            System.out.println("The ride cannot run without an operator.");
            return;
        }

        if (visitorQueue.isEmpty()) {
            System.out.println("The queue is empty. No visitors to ride.");
            return;
        }

        System.out.println("Running one cycle of the ride...");

        int riders = 0;
        while (!visitorQueue.isEmpty() && riders < maxRider) {
            Visitor visitor = visitorQueue.poll();
            addVisitorToHistory(visitor);
            riders++;
        }

        numOfCycles++;
        System.out.println(riders + " visitors took the ride this cycle.");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to the ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted by age and name.");
    }

    @Override
    public void printRideHistory() {
        System.out.println("Visitors who took the ride:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(" - " + visitor.getName() + " (Age: " + visitor.getAge() + ")");
        }
    }
}
