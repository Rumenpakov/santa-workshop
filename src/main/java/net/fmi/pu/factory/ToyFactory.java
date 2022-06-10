package net.fmi.pu.factory;

import net.fmi.pu.model.Toy;
import net.fmi.pu.model.ToyType;

public class ToyFactory {

    public static final String BICYCLE = "i need bicycle";
    public static final String DOLL = "i need doll";

    public static Toy createToy(String wishedToy) {
        if (wishedToy.equals(BICYCLE)) {
            return new Toy(ToyType.BICYCLE);
        } else if (wishedToy.equals(DOLL)) {
            return new Toy(ToyType.DOLL);
        }

        throw new IllegalArgumentException("Invalid toy wish");
    }
}
