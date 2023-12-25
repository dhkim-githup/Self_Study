package _Inheritance;

public class 참새 extends 조류 {
    public 참새() {
        myClass = "참새";
    }

    public 참새(String myClass, String name, int age) {
        super(myClass, name, age);

        this.myClass = myClass;
        this.name = name;
        this.age = age;

        System.out.println("참새 생성자");
    }
}
