package FluxControl.RepeatStructures;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Calling...");

        do {
            System.out.println("Phone ringing...");
        } while (calling());

        System.out.println("Done!");

    }

    private static boolean calling() {
        boolean answered = new Random().nextInt(3) == 1;
        System.out.println("Answered? " + answered);
        return !answered;
    }
}
