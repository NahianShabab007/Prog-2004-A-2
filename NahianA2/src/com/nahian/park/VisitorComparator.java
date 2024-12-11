package com.nahian.park;

import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Sort by age first, then by name alphabetically
        int ageComparison = Integer.compare(v1.getAge(), v2.getAge());
        if (ageComparison == 0) {
            return v1.getName().compareTo(v2.getName());
        }
        return ageComparison;
    }
}
