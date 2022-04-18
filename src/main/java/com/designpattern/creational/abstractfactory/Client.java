package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.abstractfactory.aws.AwsResourceFactory;
import com.designpattern.creational.abstractfactory.gcp.GoogleResourceFactory;

public class Client {
    ResourceFactory resourceFactory;

    public void setResourceFactory(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity cap, int storageInMiB){
        Instance instance = this.resourceFactory.createInstance(cap);
        Storage storage = this.resourceFactory.createStorage(storageInMiB);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new GoogleResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.large,20560);
        i1.start();
        i1.stop();
    }
}
