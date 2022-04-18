package com.designpattern.creational.abstractfactory.gcp;

import com.designpattern.creational.abstractfactory.Instance;
import com.designpattern.creational.abstractfactory.ResourceFactory;
import com.designpattern.creational.abstractfactory.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity cap) {
        return new GoogleComputeEngineInstance(cap);
    }

    @Override
    public Storage createStorage(int storageInMiB) {
        return new GoogleCloudStorage(storageInMiB);
    }
}
