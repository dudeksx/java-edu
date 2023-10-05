package FluxControl;

public class SimpleConditional {

    // Simple conditional expression
    public static void main(String[] args) {
        double balance = 25.0;
        double requestedValue = 17.0;

        if (requestedValue < balance)
            balance = balance - requestedValue;

        System.out.println(balance);
        System.out.println("--------------------------------");
    }
}
