package com.kk.dp.behavioral.state;

public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Its a new order. No processing done.");
        return 0;
    }
}
