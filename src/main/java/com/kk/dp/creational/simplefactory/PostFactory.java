package com.kk.dp.creational.simplefactory;

public class PostFactory {
    public static Post create(String type) {
        switch (type) {
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            case "blog":
                return new BlogPost();
            default:
                throw new IllegalArgumentException();
        }
    }
}
