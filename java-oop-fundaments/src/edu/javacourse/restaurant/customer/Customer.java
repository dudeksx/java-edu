package edu.javacourse.restaurant.customer;

public class Customer {
    public void chooseSandwich() {
        System.out.println("CHOOSING THE SANDWICH");
    }

    public void placeOrder() {
        System.out.println("PLACING THE ORDER");
    }

    public void payBill() {
        checkAppBalance();
        System.out.println("PAYING THE BILL");
    }

    private void checkAppBalance() {
        System.out.println("CHECKING BALANCE ON THE APP");
    }
}
