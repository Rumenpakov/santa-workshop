package net.fmi.pu.model;

import java.util.Observable;
import java.util.Observer;

public class Dwarf  {

    private String name;
    private Toy grabbedToy;

    public Dwarf(String name) {
        this.name = name;
    }

    public void grabToy(Toy currentToyOnBoard) {
        grabbedToy = currentToyOnBoard;
        System.out.println(name + " grabs " + grabbedToy);
    }

    public String getName() {
        return name;
    }

    public Toy getGrabbedToy() {
        return grabbedToy;
    }
}
