package com.kk.dp.creational.prototype;

public class Swordsman extends GameUnit {
    private String state = "idle";

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }

    public void attack() {
        this.state = "attacking";
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }
}
