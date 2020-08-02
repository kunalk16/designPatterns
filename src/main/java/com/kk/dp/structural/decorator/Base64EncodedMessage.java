package com.kk.dp.structural.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {
    private final Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContents() {
        return Base64.getEncoder().encodeToString(this.message.getContents().getBytes());
    }
}
