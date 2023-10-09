package edu.javacourse.messenger.apps;

public class MSNMessenger extends InstantMessageServices {

    public void sendMessage() {
        isConnected();
        System.out.println("Sending message with MSN...");
    }

    public void receiveMessage() {
        System.out.println("Receiving message with MSN...");
    }

}
