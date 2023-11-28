package com.okdevtv.indelitance;

public class Chicken extends Animal{

    int wings;

    @Override
    String getInfo() {
        return name + ", " + legs + " legs, " + wings + " wings";
    }
}
