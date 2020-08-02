package com.kk.dp.structural.proxy.staticProxy;

import java.awt.geom.Point2D;

public class ImageProxy implements Image {
    private final String name;

    private Point2D location;

    private Image bitmapImage;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D location) {
        if(this.bitmapImage == null) {
            this.location = location;
        }else{
            this.bitmapImage.setLocation(location);
        }
    }

    @Override
    public Point2D getLocation() {
        if(this.bitmapImage == null) {
            return this.location;
        }else {
            return this.bitmapImage.getLocation();
        }
    }

    @Override
    public void render() {
        if(this.bitmapImage == null) {
            this.bitmapImage = new BitmapImage(this.name);
        }

        this.bitmapImage.render();
    }
}
