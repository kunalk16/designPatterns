package com.kk.dp.creational.abstractFactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacity);
}
