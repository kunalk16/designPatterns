package com.kk.dp.structural.bridge;

public class Client {
    public static void main(String[] args) {
        FIFOCollection<Integer> fifoCollection = new Queue<>(new SinglyLinkedList<>());

        fifoCollection.offer(10);
        fifoCollection.offer(20);
        fifoCollection.offer(30);

        System.out.println(fifoCollection.poll());
        System.out.println(fifoCollection.poll());
        System.out.println(fifoCollection.poll());
        //
        System.out.println(fifoCollection.poll());
    }
}
