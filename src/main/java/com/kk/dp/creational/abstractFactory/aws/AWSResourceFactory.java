package com.kk.dp.creational.abstractFactory.aws;

import com.kk.dp.creational.abstractFactory.Instance;
import com.kk.dp.creational.abstractFactory.ResourceFactory;
import com.kk.dp.creational.abstractFactory.Storage;

public class AWSResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacity) {
        return new S3Storage(capacity);
    }
}
