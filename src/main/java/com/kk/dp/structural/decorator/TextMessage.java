package com.kk.dp.structural.decorator;

public class TextMessage implements Message {
    private final String message;

    public TextMessage(String message) {
        this.message = message;
    }

    @Override
    public String getContents() {
        return this.message;
    }
}
