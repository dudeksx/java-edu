package edu.javacourse.restaurant.attendance;

public class Waiter {
    public void serveTable() {
        getSandwichFromKitchen();
        System.out.println("SERVING THE TABLE");
    }

    private void getSandwichFromKitchen() {
        System.out.println("GETTING THE SANDWICH FROM THE KITCHEN");
    }

    public void receivePayment() {
        System.out.println("RECEIVING PAYMENT");
    }

    void changeGas() {
        System.out.println("ATTENDANT CHANGING THE GAS");
    }

    private void takeCounterOrder() {
        System.out.println("TAKING THE ORDER FROM THE COUNTER");
    }
}
