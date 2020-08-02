package com.kk.dp.creational.objctPool;

import java.awt.geom.Point2D;

public interface Image extends Poolable {
    Point2D getLocation();

    void setLocation(Point2D point2D);

    void draw();
}
