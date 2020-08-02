package com.kk.dp.creational.abstractFactory.gcp;

import com.kk.dp.creational.abstractFactory.Storage;

public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(int capacity) {
        System.out.println("Created " + toString() + " with capacity " + capacity);
    }

    @Override
    public String getId() {
        return "GCS1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
