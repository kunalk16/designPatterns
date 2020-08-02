package com.kk.dp.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("101");
        OrderObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);

        OrderObserver quantityObserver = new QuantityObserver();
        order.attach(quantityObserver);

        order.addItem(50);
        order.addItem(179);

        System.out.println(order);
    }
}
