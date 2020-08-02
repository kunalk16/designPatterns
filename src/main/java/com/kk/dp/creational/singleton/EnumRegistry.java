package com.kk.dp.creational.singleton;

public enum EnumRegistry {
    INSTANCE;

    public void getData() {
        System.out.println(this.name());
    }
}
