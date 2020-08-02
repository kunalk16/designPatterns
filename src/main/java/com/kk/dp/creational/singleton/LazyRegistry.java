package com.kk.dp.creational.singleton;

public class LazyRegistry {
    private static LazyRegistry INSTANCE;

    private LazyRegistry() {
    }

    public static LazyRegistry getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LazyRegistry();
        }

        return INSTANCE;
    }
}
