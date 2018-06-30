package com.singtel.lab.SingtelTest;

/**
 * 
 * @author SHAIK
 *
 */
public class Shark extends Fish {
    public SIZE size() {
        return SIZE.LARGE;
    }

    public COLOR color() {
        return COLOR.GREY;
    }

    public void eat() {
        System.out.println("Eat other fish");
    }
}