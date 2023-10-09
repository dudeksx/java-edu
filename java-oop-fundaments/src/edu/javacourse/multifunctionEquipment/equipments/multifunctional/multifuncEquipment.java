package edu.javacourse.multifunctionEquipment.equipments.multifunctional;

import edu.javacourse.multifunctionEquipment.equipments.copier.Copier;
import edu.javacourse.multifunctionEquipment.equipments.digitalizer.Digitalizer;
import edu.javacourse.multifunctionEquipment.equipments.printer.Printer;

public class multifuncEquipment implements Copier, Digitalizer, Printer {

    public void copy() {
        System.out.println("Copying with multifunctional equipment...");
    }

    public void print() {
        System.out.println("Printing with multifunctional equipment...");
    }

    public void digitalize() {
        System.out.println("Digitalizing with multifunctional equipment...");
    }

}
