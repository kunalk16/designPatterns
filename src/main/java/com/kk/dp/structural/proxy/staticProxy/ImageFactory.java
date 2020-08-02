package com.kk.dp.structural.proxy.staticProxy;

public class ImageFactory {
    public static Image getImage(String name) {
        return new ImageProxy(name);
    }
}
