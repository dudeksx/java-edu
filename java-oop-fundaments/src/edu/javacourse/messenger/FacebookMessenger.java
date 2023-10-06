package edu.javacourse.messenger;

public class FacebookMessenger {
    public void sendMessage() {
        isConnected();
        System.out.println("Sending message through Facebook");
        saveHistory();
    }

    public void receiveMessage() {
        System.out.println("Receiving message Facebook");
    }

    private void isConnected() {
        System.out.println("Connected to the internet");
    }

    private void saveHistory() {
        System.out.println("Saving the message history");
    }
}
