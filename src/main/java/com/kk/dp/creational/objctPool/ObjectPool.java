package com.kk.dp.creational.objctPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> implements Pool<T> {
    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> supplier, int poolCount) {
        this.availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < poolCount; i++) {
            availablePool.offer(supplier.get());
        }
    }

    @Override
    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    @Override
    public void release(T object) {
        object.reset();

        try {
            availablePool.put(object);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
