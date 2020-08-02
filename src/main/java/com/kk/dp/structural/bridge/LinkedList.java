package com.kk.dp.structural.bridge;

public interface LinkedList<T> {
    void addFirst(T object);

    void addLast(T object);

    T removeFirst();

    T removeLast();

    int getSize();
}
