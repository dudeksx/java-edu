package edu.javacourse.vehicles;

public class Car extends Vehicle {

    public void turnOn() {
        checkTheGearbox();
        checkTheGasoline();
        System.out.println("The car is turned on");
    }

    // It is a good practice to hide some of the functions in the code, so that the
    // "racetrack" object won't have access to all of the functions
    // That's called encapsulation
    private void checkTheGasoline() {
        System.out.println("The gasoline is being checked");
    }

    private void checkTheGearbox() {
        System.out.println("Checking if the Gearbox is on the P position");
    }
}
