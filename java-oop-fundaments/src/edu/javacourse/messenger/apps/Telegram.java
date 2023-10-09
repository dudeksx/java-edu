package edu.javacourse.messenger.apps;

public class Telegram extends InstantMessageServices {

    public void sendMessage() {
        isConnected();
        System.out.println("Sending message with Telegram...");
    }

    public void receiveMessage() {
        System.out.println("Receiving message with Telegram...");
    }

}
