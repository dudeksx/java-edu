package edu.javacourse.messenger;

public class UserComputer {
    public static void main(String[] args) {
        MSNMessenger messenger = new MSNMessenger();
        messenger.sendMessage();
        messenger.receiveMessage();

        FacebookMessenger face = new FacebookMessenger();
        face.sendMessage();
        face.receiveMessage();

        Telegram telegram = new Telegram();
        telegram.sendMessage();
        telegram.receiveMessage();
    }
}
