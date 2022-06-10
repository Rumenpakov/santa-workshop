package net.fmi.pu;

import net.fmi.pu.model.Dwarf;
import net.fmi.pu.model.Santa;
import net.fmi.pu.model.Workshop;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Santa santa = Santa.getInstance();
        Workshop workshop = new Workshop(Arrays.asList(new Dwarf("Jose"), new Dwarf("Ivan")), santa);

        santa.orderDwarvesToGrabBicycle();
        workshop.printDwarvesCurrentToy();

        santa.orderDwarvesToGrabDoll();
        workshop.printDwarvesCurrentToy();
    }
}
