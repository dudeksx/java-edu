package edu.javacourse.messenger;

public class InstantMessageServices {
    public void sendMessage() {
        isConnected();
        System.out.println("Sending message");
        saveHistory();
    }

    public void receiveMessage() {
        System.out.println("Receiving message");
    }

    private void isConnected() {
        System.out.println("Connected to the internet");
    }

    private void saveHistory() {
        System.out.println("Saving the message history");
    }
}
