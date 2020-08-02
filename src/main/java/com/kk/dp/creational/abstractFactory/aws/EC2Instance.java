package com.kk.dp.creational.abstractFactory.aws;

import com.kk.dp.creational.abstractFactory.Instance;
import com.kk.dp.creational.abstractFactory.Storage;

public class EC2Instance implements Instance {
    public EC2Instance(Instance.Capacity capacity) {
        System.out.println("Created " + toString() + " with capacity " + capacity);
    }

    @Override
    public void start() {
        System.out.println(toString() + " started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println(storage +" attached to " + toString());
    }

    @Override
    public void stop() {
        System.out.println(toString() + " stopped");
    }

    @Override
    public String toString() {
        return "EC2 Instance";
    }
}
