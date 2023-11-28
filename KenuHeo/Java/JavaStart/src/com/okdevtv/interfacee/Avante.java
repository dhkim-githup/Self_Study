package com.okdevtv.interfacee;

public class Avante implements Car{
    int speed;


    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public boolean accelerate() {
        return false;
    }
}
