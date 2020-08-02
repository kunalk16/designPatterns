package com.kk.dp.creational.singleton;

public class EagerRegistry {
    private static EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {
    }

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
