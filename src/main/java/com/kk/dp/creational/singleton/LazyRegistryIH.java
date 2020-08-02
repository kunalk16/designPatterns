package com.kk.dp.creational.singleton;

public class LazyRegistryIH {
    private static class InstanceHolder {
        static LazyRegistryIH INSTANCE = new LazyRegistryIH();
    }

    public static LazyRegistryIH getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
