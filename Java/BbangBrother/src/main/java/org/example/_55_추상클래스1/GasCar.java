package org.example._55_추상클래스1;

import lombok.AllArgsConstructor;

public class GasCar extends Car{

    public GasCar(String color, String manufacture){
        super(color, manufacture);
    }
    @Override
    public String fillup() {
        return "가스를 충전!!";
    }
}
