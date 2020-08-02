package com.kk.dp.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Message message = new TextMessage("May the <FORCE> be with you!");
        displayMessage(message);

        Message decorator = new HTMLEncodedMessage(message);
        displayMessage(decorator);

        decorator = new Base64EncodedMessage(decorator);
        displayMessage(decorator);
    }

    private static void displayMessage(Message message) {
        System.out.println(message.getContents());
    }
}
