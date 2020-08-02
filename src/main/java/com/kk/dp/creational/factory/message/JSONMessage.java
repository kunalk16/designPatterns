package com.kk.dp.creational.factory.message;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }
}
