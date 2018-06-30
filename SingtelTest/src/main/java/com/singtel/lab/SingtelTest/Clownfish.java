package com.singtel.lab.SingtelTest;

/**
 * 
 * @author SHAIK
 *
 */
public class Clownfish extends Fish {
    public SIZE size() {
        return SIZE.SMALL;
    }

    public COLOR color() {
        return COLOR.ORANGE;
    }

    public boolean makeJoke() {
        System.out.println("I can tell jokes");
        return true;
    }
}

