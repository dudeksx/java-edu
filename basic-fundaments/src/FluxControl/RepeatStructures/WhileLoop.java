package FluxControl.RepeatStructures;

import java.util.concurrent.ThreadLocalRandom;

public class WhileLoop {
    public static void main(String[] args) {
        double allowance = 50.0;
        while (allowance > 0) {
            Double ItemPrice = randomNumber();
            if (ItemPrice > allowance)
                ItemPrice = allowance;

            System.out.println("ItemPrice: " + ItemPrice);
            allowance = allowance - ItemPrice;
        }
        System.out.println("Allowance: " + allowance);
        System.out.println("John spend all his allowance");
    }

    private static double randomNumber() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
