package com.kk.dp.creational.objctPool;

public class Client {
    public static void main(String[] args) {
        Pool<Image> bitmapPool = new ObjectPool<>(() -> new BitmapImage("image.bmp"), 5);
        Image i1 = bitmapPool.get();
        Image i2 = bitmapPool.get();

        i1.draw();
        i2.draw();

        bitmapPool.release(i1);

        Image i3 = bitmapPool.get();
        i3.draw();

        bitmapPool.release(i2);
        bitmapPool.release(i3);
    }
}
