package _Inheritance;

public class 조류 extends 동물 {
    조류() {
        myClass = "조류";
    }

    public 조류(String myClass, String name, int age) {
        super("동물: " + myClass, "동물: " + name, 10 + age);

        System.out.println("조류 생성자");
        this.myClass = "조류: " + myClass;
        this.name = "이름: " + name;
        this.age = 5 + age;

        showMe();
    }

    public void doFly() {
        System.out.printf("조류 -> %s 는 날 수 있다.\n", name);
    }
}
