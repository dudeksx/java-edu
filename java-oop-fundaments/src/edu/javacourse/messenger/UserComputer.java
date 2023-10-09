package edu.javacourse.messenger;

import edu.javacourse.messenger.apps.FacebookMessenger;
import edu.javacourse.messenger.apps.InstantMessageServices;
import edu.javacourse.messenger.apps.MSNMessenger;
import edu.javacourse.messenger.apps.Telegram;

public class UserComputer {
    public static void main(String[] args) {
        InstantMessageServices smi = null;

        String chosenApp = "tlg";

        if (chosenApp.equals("msn"))
            smi = new MSNMessenger();
        else if (chosenApp.equals("fbm"))
            smi = new FacebookMessenger();
        else if (chosenApp.equals("tlg"))
            smi = new Telegram();

        smi.sendMessage();
        smi.receiveMessage();
    }
}
