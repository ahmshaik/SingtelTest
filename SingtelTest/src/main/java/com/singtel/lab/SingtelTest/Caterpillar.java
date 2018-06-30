package com.singtel.lab.SingtelTest;

/**
 * 
 * @author SHAIK
 *
 */
public class Caterpillar extends FlyAnimal implements Animal {
    public boolean walk() {
        return true;
    }

    public boolean fly() {
        return false;
    }
}
