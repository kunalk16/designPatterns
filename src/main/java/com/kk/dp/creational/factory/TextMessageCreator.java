package com.kk.dp.creational.factory;

import com.kk.dp.creational.factory.message.Message;
import com.kk.dp.creational.factory.message.TextMessage;

public class TextMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
