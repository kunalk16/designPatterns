package com.kk.dp.creational.abstractFactory;

public interface Instance {
    enum Capacity {small, medium, large};

    void start();

    void attachStorage(Storage storage);

    void stop();
}
