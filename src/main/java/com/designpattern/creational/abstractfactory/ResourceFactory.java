package com.designpattern.creational.abstractfactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity cap);
    Storage createStorage(int storageInMiB);
}
