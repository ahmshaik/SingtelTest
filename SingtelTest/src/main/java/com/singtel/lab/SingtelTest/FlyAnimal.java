package com.singtel.lab.SingtelTest;

/**
 * 
 * @author SHAIK
 *
 */
public abstract class FlyAnimal {
    public abstract boolean walk();

    public abstract boolean fly();

    public boolean sing() {
        return false;
    }

    public boolean swim() {
        return false;
    }
}
