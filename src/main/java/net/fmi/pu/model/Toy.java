package net.fmi.pu.model;

public class Toy {

    private ToyType toyType;

    public Toy(ToyType toyType) {
        this.toyType = toyType;
    }

    public ToyType getToyType() {
        return toyType;
    }

    @Override
    public String toString() {
        return toyType.toString();
    }
}
