package org.example._58_추상클래스;

public class Cat extends Pet{

    public Cat(boolean wing, int legCount){
        super(wing, legCount);
    }
    @Override
    public void run(String name) {
        System.out.printf("%s는 소리없이 조용하게 뜁니다 \n",name);
    }
}
