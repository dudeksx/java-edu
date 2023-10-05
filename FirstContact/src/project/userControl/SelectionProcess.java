package project.userControl;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {
    public static void main(String[] args) {
        // analyzeCandidates(1900.0);
        // analyzeCandidates(2200.0);
        // analyzeCandidates(2000.0);

        // candidatesSelection();
        // printSelected();

        String[] candidates = { "John", "Julien", "Jay", "James", "Jameson" };
        for (String candidate : candidates) {
            callToCandidate(candidate);
        }
    }

    // This function "calls" the chosen candidates.
    static void callToCandidate(String candidate) {
        int attemptsMade = 1;
        boolean continueTrying = true;
        boolean answered = false;
        do {
            answered = answer();
            continueTrying = !answered;
            if (continueTrying)
                attemptsMade++;
            else
                System.out.println("The candidate answered");
        } while (continueTrying && attemptsMade < 3);
        if (answered)
            System.out.println("The candidate " + candidate + " has answered in " + attemptsMade + " attempts");
        else
            System.out.println("We could not call the candidate " + candidate);
    }

    static boolean answer() {
        return new Random().nextInt(3) == 1;
    }

    // This function prints the "chosen" candidates along with them index position.
    static void printSelected() {
        String[] candidates = { "John", "Julien", "Jay", "James", "Jameson" };
        System.out.println("Printing the selected candidates list with name and index");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("The candidate number: " + (i + 1) + " is " + candidates[i]);
        }

        System.out.println("Abbreviated form of iteration for each");
        for (String candidate : candidates) {
            System.out.println("The chosen candidate was " + candidate);
        }
    }

    // This function selects a maximum number of 5 candidates, the prerequisites
    // are: a desired salary equal or minimus than the base salary
    static void candidatesSelection() {
        String[] candidates = { "John", "Julien", "Jay", "James", "Jameson", "Jamal", "Jin", "Jonathan", "Jonas",
                "Joana" };
        int selectedCandidates = 0;
        int actualCandidates = 0;
        double baseSalary = 2000.0;
        while (selectedCandidates < 5 && actualCandidates < candidates.length) {
            String candidate = candidates[actualCandidates];
            double desiredSalary = desiredValue();

            System.out.println("The candidate " + candidate + " Asked for the salary value " + desiredSalary);
            if (baseSalary >= desiredSalary) {
                System.out.println("The candidate " + candidate + " was selected for the vacancy");
                selectedCandidates++;
            }
            actualCandidates++;

        }
    }

    static double desiredValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analyzeCandidates(double desiredSalary) {
        double baseSalary = 2000.0;
        if (baseSalary > desiredSalary) {
            System.out.println("Call the candidate");
        } else if (baseSalary == desiredSalary) {
            System.out.println("Call the candidate with a counter proposal");
        } else {
            System.out.println("Wait for the other candidates");
        }
    }
}