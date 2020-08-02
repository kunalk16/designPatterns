package com.kk.dp.creational.objctPool;

public interface Pool<T extends Poolable> {
    T get();

    void release(T object);
}
