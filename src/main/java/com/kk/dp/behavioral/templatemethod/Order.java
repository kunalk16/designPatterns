package com.kk.dp.behavioral.templatemethod;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private final String id;

    private final LocalDate date;

    private final Map<String, Double> items;

    private double total;

    public Order(String id) {
        this.id = id;
        this.date = LocalDate.now();
        this.items = new HashMap<>();
    }

    public String getId() {
        return this.id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public Map<String, Double> getItems() {
        return this.items;
    }

    public void addItem(String name, double price) {
        this.items.put(name, price);
        this.total+= price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
