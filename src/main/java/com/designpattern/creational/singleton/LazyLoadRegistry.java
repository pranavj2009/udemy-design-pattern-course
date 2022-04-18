package com.designpattern.creational.singleton;

public class LazyLoadRegistry {
    private LazyLoadRegistry(){

    }

    private static volatile LazyLoadRegistry INSTANCE;

    public static LazyLoadRegistry getInstance(){
        if(INSTANCE == null){
            synchronized (LazyLoadRegistry.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyLoadRegistry();
                }
            }
        }
        return INSTANCE;
    }
}
