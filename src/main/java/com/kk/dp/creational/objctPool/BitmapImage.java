package com.kk.dp.creational.objctPool;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
    private Point2D point2D;
    private final String name;

    public BitmapImage(String name) {
        this.name = name;
    }

    @Override
    public Point2D getLocation() {
        return this.point2D;
    }

    @Override
    public void setLocation(Point2D point2D) {
        this.point2D = point2D;
    }

    @Override
    public void draw() {
        System.out.println("Drawing : " + name + " at location " + point2D);
    }

    @Override
    public void reset() {
        this.point2D = null;
        System.out.println("Bitmap is reset");
    }
}
