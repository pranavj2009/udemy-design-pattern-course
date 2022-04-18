package com.designpattern.creational.prototype;

public class Swordsman extends GameUnit{
    private String state = "idle";

    public void attack(){
        this.state = "attack";
    }

    @Override
    public String toString() {
        return "Swordsman "+state+" @ "+getPosition();
    }

    @Override
    public void reset() {
        state = "idle";
    }
}
