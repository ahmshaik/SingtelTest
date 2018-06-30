package com.singtel.lab.SingtelTest;

/**
 * 
 * @author SHAIK
 *
 */
public class Parrot extends Bird {
    private String sing = "";

    public Parrot() {
    }

    public Parrot(String sing) {
        this.sing = sing;
    }

    public boolean sing() {
        System.out.println(this.sing);
        return true;
    }
    
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	return ((Parrot)obj).sing.equals(this.sing);
    }
}
