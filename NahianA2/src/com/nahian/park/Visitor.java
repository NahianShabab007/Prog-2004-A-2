package com.nahian.park;

public class Visitor extends Person {
    private String membershipType;
    private String visitDate;

    // Default constructor
    public Visitor() {
        super();
        this.membershipType = "";
        this.visitDate = "";
    }

    // Parameterized constructor
    public Visitor(String name, int age, String id, String membershipType, String visitDate) {
        super(name, age, id);
        this.membershipType = membershipType;
        this.visitDate = visitDate;
    }

    // Getters and setters
    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
}
