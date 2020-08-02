package com.kk.dp.creational.simplefactory;

public class Client {
    public static void main(String[] args) {
        Post newsPost = PostFactory.create("news");
        System.out.println(newsPost);

        Post blogPost = PostFactory.create("blog");
        System.out.println(blogPost);

        Post productPost = PostFactory.create("product");
        System.out.println(productPost);
    }
}
