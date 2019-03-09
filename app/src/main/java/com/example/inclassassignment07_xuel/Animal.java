package com.example.inclassassignment07_xuel;

import java.io.Serializable;

public  class Animal implements Serializable {
    String name;
    int legs;
    String moreInform;
    boolean hasFurr;

    @Override
    public String toString() {
        return "Animal Nname: " + name + "\nlegs:" + legs +
                "\nHas Fur? " + hasFurr +
                "\n More Information: " + moreInform;
    }

    public Animal(String name, int legsNumber, String info, boolean hasfurr) {
        this.name = name;
        this.hasFurr = hasfurr;
        this.legs = legsNumber;
        this.moreInform = info;


    }





}
