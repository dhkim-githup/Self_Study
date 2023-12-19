package org.example._54_Lombok;

import lombok.Data;

@Data
public class Car {
    private String color;
    private int door;
    private String manufacture;

    public Car(String color, int door, String manufacture) {
        this.color = color;
        this.door = door;
        this.manufacture = manufacture;
    }
}
