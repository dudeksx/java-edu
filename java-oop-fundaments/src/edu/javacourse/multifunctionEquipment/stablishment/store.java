package edu.javacourse.multifunctionEquipment.stablishment;

import edu.javacourse.multifunctionEquipment.equipments.copier.Copier;
import edu.javacourse.multifunctionEquipment.equipments.digitalizer.Digitalizer;
import edu.javacourse.multifunctionEquipment.equipments.multifunctional.multifuncEquipment;
import edu.javacourse.multifunctionEquipment.equipments.printer.Deskjet;
import edu.javacourse.multifunctionEquipment.equipments.printer.Printer;

public class store {
    public static void main(String[] args) {
        multifuncEquipment em = new multifuncEquipment();

        Deskjet deskjet = new Deskjet();

        Printer printer = deskjet;
        Digitalizer digitalizer = em;
        Copier copier = em;

        printer.print();
        digitalizer.digitalize();
        copier.copy();
    }
}
