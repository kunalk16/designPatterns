package com.kk.dp.creational.factory;

import com.kk.dp.creational.factory.message.JSONMessage;
import com.kk.dp.creational.factory.message.Message;

public class JSONMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
