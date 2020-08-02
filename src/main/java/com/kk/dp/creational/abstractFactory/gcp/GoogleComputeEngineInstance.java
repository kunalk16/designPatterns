package com.kk.dp.creational.abstractFactory.gcp;

import com.kk.dp.creational.abstractFactory.Instance;
import com.kk.dp.creational.abstractFactory.Storage;

public class GoogleComputeEngineInstance implements Instance {
    public GoogleComputeEngineInstance(Instance.Capacity capacity) {
        System.out.println("Created " + toString() + " with capacity " + capacity);
    }

    @Override
    public String toString() {
        return "Google Compute Engine Instance";
    }

    @Override
    public void start() {
        System.out.println("Started " + toString());
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println(storage +" attached to " + toString());
    }

    @Override
    public void stop() {
        System.out.println("Stopped " + toString());
    }
}
