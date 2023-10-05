package FluxControl;

public class ChainedConditional {
    public static void main(String[] args) {
        int note = 6;

        if (note >= 7)
            System.out.println("Approved");

        else if (note >= 5 && note < 7)
            System.out.println("Recovery");

        else
            System.out.println("Failed");
    }
}
