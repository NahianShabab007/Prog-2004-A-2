package com.nahian.park;

public class Employee extends Person {
    private String position;
    private String shiftTime;

    // Default constructor
    public Employee() {
        super();
        this.position = "";
        this.shiftTime = "";
    }

    // Parameterized constructor
    public Employee(String name, int age, String id, String position, String shiftTime) {
        super(name, age, id);
        this.position = position;
        this.shiftTime = shiftTime;
    }

    // Getters and setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }
}
