package FluxControl.ExceptionStructures;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Enter your name: ");
            String name = scanner.next();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Enter your height: ");
            double height = scanner.nextDouble();

            // Printing the data
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Name must be a string, age and height must be a number");
        }
    }
}
