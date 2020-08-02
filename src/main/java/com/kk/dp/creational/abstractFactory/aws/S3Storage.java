package com.kk.dp.creational.abstractFactory.aws;

import com.kk.dp.creational.abstractFactory.Storage;

public class S3Storage implements Storage {
    public S3Storage(int capacity) {
        System.out.println("Created " + toString() + " with capacity " + capacity);
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
