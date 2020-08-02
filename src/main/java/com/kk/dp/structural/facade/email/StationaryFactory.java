package com.kk.dp.structural.facade.email;

public class StationaryFactory {
    public static Stationary createStationary() {
        return new HalloweenStationary();
    }
}
