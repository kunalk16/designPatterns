package com.kk.dp.structural.proxy.dynamic;

import java.awt.*;
import java.awt.geom.Point2D;

public class Client {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage("Image.bmp");
        Point2D point = new Point();
        point.setLocation(1.0d, 2.0d);
        image.setLocation(point);

        System.out.println("Image location: " + image.getLocation());

        image.render();
    }
}
