package edu.javacourse.messenger;

public class Telegram {
    public void sendMessage() {
        isConnected();
        System.out.println("Sending message through Telegram");
        saveHistory();
    }

    public void receiveMessage() {
        System.out.println("Receiving message Telegram");
    }

    private void isConnected() {
        System.out.println("Connected to the internet");
    }

    private void saveHistory() {
        System.out.println("Saving the message history");
    }
}
