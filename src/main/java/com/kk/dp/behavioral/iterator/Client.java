package com.kk.dp.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        Iterator<ThemeColor> themeColorIterator = ThemeColor.getIterator();

        while (themeColorIterator.hasNext()) {
            System.out.println(themeColorIterator.next());
        }
    }
}
