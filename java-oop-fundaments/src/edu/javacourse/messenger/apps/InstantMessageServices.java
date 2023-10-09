package edu.javacourse.messenger.apps;

public abstract class InstantMessageServices {
    public abstract void sendMessage();

    public abstract void receiveMessage();

    protected void isConnected() {
        System.out.println("Validating if the user have internet connectivity");
    };
}
