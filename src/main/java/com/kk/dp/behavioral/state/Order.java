package com.kk.dp.behavioral.state;

public class Order {
    private OrderState orderState;

    public Order() {
        this.orderState = new New();
    }

    public double cancel() {
        double cancellationCharges = this.orderState.handleCancellation();
        this.orderState = new Cancelled();
        return cancellationCharges;
    }

    public void paymentSuccessful() {
        this.orderState = new Paid();
    }

    public void dispatched() {
        this.orderState = new InTransit();
    }

    public void delivered() {
        this.orderState = new Delivered();
    }
}
