package com.designpattern.creational.singleton;

/**
 * Here we let the java classloader take care of the lazy loading. The inner class will be loaded only when the
 * getLazyRegistryInstance() method is called from the LazyRegistry class. This inner class won't be loaded during
 * compile time
 */
public class LazyRegistryWithInnerClass {
    private LazyRegistryWithInnerClass(){
        System.out.println("LazyRegistry loaded");
    }

    private static class RegistryHolder{
            static LazyRegistryWithInnerClass registry = new LazyRegistryWithInnerClass();
    }

    public static LazyRegistryWithInnerClass getLazyRegistryInstance(){
        return RegistryHolder.registry;
    }
}
