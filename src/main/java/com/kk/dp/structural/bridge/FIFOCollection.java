package com.kk.dp.structural.bridge;

public interface FIFOCollection<T> {
    void offer(T element);

    T poll();
}
