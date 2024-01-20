package Inheritance.mammal;

import Inheritance.Animal;

/**
 * 나는 Animal 을 상속받아요.
 */
public class Mammal extends Animal {

    public Mammal(String name, int age) {
        super(name, age);
    }

    public void doRun(){
        System.out.printf("나 %s 는 달리기를 잘 합니다.\n");
    }
}
