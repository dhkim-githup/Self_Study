package org.example._55_추상클래스1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Car {

    protected String color;
    protected String manufacture;

    public abstract String fillup();

    public void printInfo(){
        System.out.println("이 차의 색:"+this.color);
        System.out.println("이 차의 제조사:"+this.manufacture);
        System.out.println("이 차의 충전:"+fillup());
    }
}
