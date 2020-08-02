package com.kk.dp.creational.factory;

import com.kk.dp.creational.factory.message.Message;

public abstract class MessageCreator {
    public Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    protected abstract Message createMessage();
}
