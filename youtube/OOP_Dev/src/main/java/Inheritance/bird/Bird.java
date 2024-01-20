package Inheritance.bird;

import Inheritance.Animal;

/**
 * 나는 Animal 을 상속받아요.
 */
public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void doFly(){
        System.out.printf("나 %s 는 날 수 있습니다.\n");
    }
}
