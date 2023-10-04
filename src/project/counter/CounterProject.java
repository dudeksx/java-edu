package project.counter;

import java.util.Scanner;

public class CounterProject {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Type the first parameter: ");
        int firstParameter = terminal.nextInt();
        System.out.println("Type the second parameter: ");
        int secondParameter = terminal.nextInt();

        try {
            count(firstParameter, secondParameter);
        } catch (InvalidParameterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static class InvalidParameterException extends Exception {
        public InvalidParameterException(String message) {
            super(message);
        }

    }

    static void count(int firstParameter, int secondParameter) throws InvalidParameterException {
        if (secondParameter <= firstParameter) {
            throw new InvalidParameterException("The second parameter must be greater than the first parameter");
        }
        int counter = secondParameter - firstParameter;
        for (int i = 1; i <= counter; i++) {
            System.out.println("Counter: " + i);
        }
    }
}
