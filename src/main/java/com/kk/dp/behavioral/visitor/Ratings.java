package com.kk.dp.behavioral.visitor;

import java.util.HashMap;

public class Ratings extends HashMap<Integer, PerformanceRating> {
    public int getFinalRating(int empId) {
        return get(empId).getFinalRating();
    }
}
