package com.kk.dp.structural.proxy.staticProxy;

import java.awt.geom.Point2D;

public interface Image {
    void setLocation(Point2D location);

    Point2D getLocation();

    void render();
}
