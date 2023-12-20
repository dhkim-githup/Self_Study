package org.example._58_추상클래스;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Pet {

    private boolean wing;

    @Getter
    private int legCount;

    public String isWing(){
        String str;
        if(this.wing==true){
            str = "날 수 있다.";
        }else{
            str = "날 수 없다.";
        }
        return str;
    }

    public abstract void run(String name);


}
