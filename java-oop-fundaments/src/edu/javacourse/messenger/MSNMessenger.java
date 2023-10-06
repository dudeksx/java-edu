package edu.javacourse.messenger;

public class MSNMessenger {
    public void sendMessage() {
        isConnected();
        System.out.println("Sending message MSN");
        saveHistory();
    }

    public void receiveMessage() {
        System.out.println("Receiving message MSN");
    }

    private void isConnected() {
        System.out.println("Connected to the internet");
    }

    private void saveHistory() {
        System.out.println("Saving the message history");
    }
}
