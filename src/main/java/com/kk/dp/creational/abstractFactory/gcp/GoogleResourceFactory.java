package com.kk.dp.creational.abstractFactory.gcp;

import com.kk.dp.creational.abstractFactory.Instance;
import com.kk.dp.creational.abstractFactory.ResourceFactory;
import com.kk.dp.creational.abstractFactory.Storage;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacity) {
        return new GoogleCloudStorage(capacity);
    }
}
