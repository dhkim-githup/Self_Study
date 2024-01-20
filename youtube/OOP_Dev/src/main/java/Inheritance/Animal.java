package Inheritance;

/**
 * 내가 최 상위 Class 입니다.
 */
public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doShowMe(){
        System.out.printf("내 이름은 %s , 내 나이는 %d 입니다. \n");
    }
}
