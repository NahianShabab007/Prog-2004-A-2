package com.nahian.park;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
    }

    public void partThree() {
        // Create a new Ride object
        Employee operator = new Employee("John Doe", 30, "E001", "Operator", "9 AM - 5 PM");
        Ride rollerCoaster = new Ride("Roller Coaster", 20, operator);

        // Create Visitor objects
        Visitor v1 = new Visitor("Alice", 25, "V001", "Premium", "2024-12-01");
        Visitor v2 = new Visitor("Bob", 22, "V002", "Standard", "2024-12-01");
        Visitor v3 = new Visitor("Charlie", 30, "V003", "Standard", "2024-12-01");
        Visitor v4 = new Visitor("Diana", 28, "V004", "Premium", "2024-12-01");
        Visitor v5 = new Visitor("Eve", 27, "V005", "Standard", "2024-12-01");

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
        rollerCoaster.addVisitorToQueue(v3);
        rollerCoaster.addVisitorToQueue(v4);
        rollerCoaster.addVisitorToQueue(v5);

        // Print the queue
        System.out.println("\nQueue after adding visitors:");
        rollerCoaster.printQueue();

        // Remove one visitor
        rollerCoaster.removeVisitorFromQueue();

        // Print the queue again
        System.out.println("\nQueue after removing a visitor:");
        rollerCoaster.printQueue();
    }

    public void partFourA() {
    }

    public void partFourB() {
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
