package net.fmi.pu.model;

import net.fmi.pu.factory.ToyFactory;

import java.util.Observable;
import java.util.Observer;

public class Santa extends Observable {

    public static final String BICYCLE = "i need bicycle";
    public static final String DOLL = "i need doll";

    private static final Santa INSTANCE = new Santa();

    public static Santa getInstance() {
        return INSTANCE;
    }

    public void orderDwarvesToGrabDoll() {
        Toy toy = ToyFactory.createToy(DOLL);
        setChanged();
        notifyObservers(toy);
    }

    public void orderDwarvesToGrabBicycle() {
        Toy toy = ToyFactory.createToy(BICYCLE);
        setChanged();
        notifyObservers(toy);
    }
}
