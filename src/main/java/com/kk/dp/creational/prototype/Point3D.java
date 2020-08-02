package com.kk.dp.creational.prototype;

public class Point3D {
    public final static Point3D ZERO = new Point3D(0, 0, 0);

    private final float x, y, z;

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D normalize() {
        // Implementation
        return this;
    }

    public Point3D multiply(float point3D) {
        // Implementation
        return this;
    }

    public Point3D direction(float a) {
        // Implementation
        return this;
    }

    public Point3D add(Point3D a) {
        // Implementation
        return this;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y + " " + this.z;
    }
}
