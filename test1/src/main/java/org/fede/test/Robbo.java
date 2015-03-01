package org.fede.test;

/**
 * Created by fede on 2/28/15.
 */
public class Robbo {
    public Robbo(String name) {
        this.name = name;
    }

    private String name;

    public String sayHello(){
        return name;
    }

    public String sayBanana(){
        return "Banana";
    }



}