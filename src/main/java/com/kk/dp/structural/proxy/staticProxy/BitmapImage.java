package com.kk.dp.structural.proxy.staticProxy;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
    private final String name;

    private Point2D location;

    public BitmapImage(String name) {
        this.name = name;
        System.out.println("Initializing Bitmap Image");
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void render() {
        System.out.println("Rendering Image");
    }

    @Override
    public String toString() {
        return "Image: " + this.name;
    }
}
