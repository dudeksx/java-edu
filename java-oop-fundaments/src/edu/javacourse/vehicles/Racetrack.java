package edu.javacourse.vehicles;

public class Racetrack {
    public static void main(String[] args) {
        // Example of Abstração
        Car ferrari = new Car();
        ferrari.setChassis("89b219");
        // ferrari.turnOn();

        // Example of polymorphism
        Bike RR1100 = new Bike();
        RR1100.setChassis("BA930F");
        // RR1100.turnOn();

        Vehicle fiat = ferrari;
        fiat.turnOn();
    }
}
