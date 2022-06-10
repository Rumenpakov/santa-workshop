package net.fmi.pu.model;

import net.fmi.pu.factory.ToyFactory;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Workshop implements Observer {

    private Toy currentToyOnBoard;
    private List<Dwarf> dwarves;
    private Santa santa;

    public Workshop(List<Dwarf> dwarves, Santa santa) {
        this.dwarves = dwarves;
        this.santa = santa;
        santa.addObserver(this);
    }

    private void updateBoard(Toy toy) {
        currentToyOnBoard = toy;
        dwarvesGrabToy();
    }

    private void dwarvesGrabToy() {
        for (Dwarf dwarf : dwarves) {
            dwarf.grabToy(currentToyOnBoard);
        }
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof Toy) {
            updateBoard((Toy)arg);
        }
    }

    public void printDwarvesCurrentToy() {
        for (Dwarf dwarf : dwarves) {
            System.out.println(dwarf.getName() + " holds " + dwarf.getGrabbedToy());
        }
    }
}
