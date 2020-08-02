package com.kk.dp.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

public class HTMLEncodedMessage implements Message {
    private final Message message;

    public HTMLEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContents() {
        return StringEscapeUtils.escapeHtml4(this.message.getContents());
    }
}
