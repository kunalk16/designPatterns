package com.kk.dp.structural.flyweight;

public class SystemErrorMessage implements ErrorMessage {
    private final String messageTemplate;

    private final String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        return this.messageTemplate.replace("$code", code) + this.helpUrlBase + code;
    }
}
