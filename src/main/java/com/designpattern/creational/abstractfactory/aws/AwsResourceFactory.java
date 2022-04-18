package com.designpattern.creational.abstractfactory.aws;

import com.designpattern.creational.abstractfactory.Instance;
import com.designpattern.creational.abstractfactory.ResourceFactory;
import com.designpattern.creational.abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity cap) {
        return new EC2Instance(cap);
    }

    @Override
    public Storage createStorage(int storageInMiB) {
        return new S3Storage(storageInMiB);
    }
}
