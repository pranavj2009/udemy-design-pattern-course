package com.designpattern.creational.singleton;

public class Client {

    public static void main(String[] args) {
        //Client.testLazyRegistryWithInnerClass();
        System.out.println(Client.testLazyRegistry());;
    }

    private static void testLazyRegistryWithInnerClass(){
        LazyRegistryWithInnerClass registry;
        registry = LazyRegistryWithInnerClass.getLazyRegistryInstance();
    }

    private static boolean testLazyRegistry(){
        LazyLoadRegistry registry1 = LazyLoadRegistry.getInstance();
        LazyLoadRegistry registry2 = LazyLoadRegistry.getInstance();

        return registry1 == registry2;
    }
}
