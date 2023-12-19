package org.example._55_추상클래스1;

import lombok.AllArgsConstructor;


public class ElectricCar extends Car {

    public ElectricCar(String color, String manufacture){
        super(color, manufacture);
    }
    @Override
    public String fillup() {
        return "전기를 충전!!";
    }
}
