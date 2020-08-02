package com.kk.dp.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

public class ImageFactory {
    public static Image getImage(String fileName) {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class},
                new ImageInvocationHandler(fileName));
    }
}
