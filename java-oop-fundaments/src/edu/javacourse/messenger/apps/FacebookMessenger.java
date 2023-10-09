package edu.javacourse.messenger.apps;

public class FacebookMessenger extends InstantMessageServices {

    public void sendMessage() {
        isConnected();
        System.out.println("Sending message with Facebook...");
    }

    public void receiveMessage() {
        System.out.println("Receiving message with Facebook...");
    }

}
