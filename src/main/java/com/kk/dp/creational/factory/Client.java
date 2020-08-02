package com.kk.dp.creational.factory;

import com.kk.dp.creational.factory.message.Message;

public class Client {
    public static void main(String[] args) {
        System.out.println(getMessage(new JSONMessageCreator()).getContent());
        System.out.println(getMessage(new TextMessageCreator()).getContent());
    }

    private static Message getMessage(MessageCreator messageCreator) {
        return messageCreator.getMessage();
    }
}
