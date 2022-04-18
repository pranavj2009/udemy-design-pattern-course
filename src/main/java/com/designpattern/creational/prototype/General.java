package com.designpattern.creational.prototype;

public class General extends GameUnit{
    private String state = "idle";

    public void boostMorale(){
        this.state = "Morale boost";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public String toString() {
        return "General "+state+" @ "+getPosition();
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Generels cannot reset");
    }
}
