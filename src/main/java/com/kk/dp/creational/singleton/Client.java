package com.kk.dp.creational.singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println(EagerRegistry.getInstance());
        System.out.println(EagerRegistry.getInstance());
        System.out.println(EagerRegistry.getInstance());

        System.out.println(EnumRegistry.INSTANCE);
        System.out.println(EnumRegistry.INSTANCE);
        System.out.println(EnumRegistry.INSTANCE);

        System.out.println(LazyRegistry.getInstance());
        System.out.println(LazyRegistry.getInstance());
        System.out.println(LazyRegistry.getInstance());

        System.out.println(LazyRegistryIH.getInstance());
        System.out.println(LazyRegistryIH.getInstance());
        System.out.println(LazyRegistryIH.getInstance());
    }
}
