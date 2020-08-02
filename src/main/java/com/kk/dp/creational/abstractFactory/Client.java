package com.kk.dp.creational.abstractFactory;

import com.kk.dp.creational.abstractFactory.aws.AWSResourceFactory;
import com.kk.dp.creational.abstractFactory.gcp.GoogleResourceFactory;

public class Client {
    private final ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int capacityM) {
        Instance instance = this.resourceFactory.createInstance(capacity);
        Storage storage = this.resourceFactory.createStorage(capacityM);
        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
        Client awsClient = new Client(new AWSResourceFactory());

        Instance awsInstance = awsClient.createServer(Instance.Capacity.medium, 10000);
        awsInstance.start();
        awsInstance.stop();

        Client googleClient = new Client(new GoogleResourceFactory());
        Instance googleInstance = googleClient.createServer(Instance.Capacity.large, 9000);
        googleInstance.start();
        googleInstance.stop();
    }
}
