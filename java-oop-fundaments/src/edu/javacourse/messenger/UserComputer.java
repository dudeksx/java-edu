package edu.javacourse.messenger;

public class UserComputer {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("MSN");
        MSNMessenger messenger = new MSNMessenger();
        messenger.sendMessage();
        messenger.receiveMessage();

        System.out.println("--------------------------------");
        System.out.println("Facebook");
        FacebookMessenger face = new FacebookMessenger();
        face.sendMessage();
        face.receiveMessage();

        System.out.println("--------------------------------");
        System.out.println("Telegram");
        Telegram telegram = new Telegram();
        telegram.sendMessage();
        telegram.receiveMessage();
        System.out.println("--------------------------------");
    }
}
