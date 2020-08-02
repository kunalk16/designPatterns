package com.kk.dp.structural.bridge;

public class Queue<T> implements FIFOCollection<T> {
    private final LinkedList<T> linkedList;

    public Queue(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void offer(T element) {
        this.linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return this.linkedList.removeFirst();
    }
}
