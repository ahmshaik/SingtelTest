package com.singtel.lab.SingtelTest;

/**
 * 
 * @author SHAIK
 *
 */
public class Butterfly extends FlyAnimal implements Animal {
    public boolean walk() {
        return false;
    }

    public boolean fly() {
        return true;
    }
}