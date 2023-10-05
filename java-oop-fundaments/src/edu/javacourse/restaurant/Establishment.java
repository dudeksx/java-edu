package edu.javacourse.restaurant;

import edu.javacourse.restaurant.attendance.Waiter;
import edu.javacourse.restaurant.attendance.kitchen.Cook;
import edu.javacourse.restaurant.customer.Customer;

public class Establishment {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.chooseSandwich();
        customer.placeOrder();
        customer.payBill();

        Cook cook = new Cook();

        // Actions that the establishment needs to be aware of
        cook.addJuiceToCounter();
        cook.addSandwichToCounter();
        cook.addComboToCounter();

        Waiter waiter = new Waiter();
        waiter.serveTable();
        waiter.receivePayment();

    }
}
