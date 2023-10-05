package edu.javacourse.restaurant.attendance.kitchen;

public class Storekeeper {
    private void controlEntry() {
        System.out.println("CONTROLLING ITEM ENTRY");
    }

    private void controlExit() {
        System.out.println("CONTROLLING ITEM EXIT");
    }

    void deliverIngredients() {
        System.out.println("DELIVERING INGREDIENTS");
        controlExit();
    }

    void changeGas() {
        System.out.println("WAREHOUSE WORKER CHANGING GAS");
    }
}