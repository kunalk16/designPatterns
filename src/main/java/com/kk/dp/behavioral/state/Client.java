package com.kk.dp.behavioral.state;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        order.paymentSuccessful();
        order.dispatched();
        order.delivered();

        System.out.println(order.cancel());

        order = new Order();

        order.paymentSuccessful();
        order.dispatched();

        System.out.println(order.cancel());
    }
}
