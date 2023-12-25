package _Inheritance;

public class 동물 {

    String myClass;
    String name;
    int age;

    public 동물() {
        myClass = "동물";
    }

    public 동물(String myClass, String name, int age) {
        this.myClass = myClass;
        this.name = name;
        this.age = age;
        System.out.println("동물 생성자");
        showMe();
    }

    void showMe() {
        // System.out.println(myClass.toString());
        System.out.printf("%s , 나는 %s, 나이는 %d \n", myClass, name, age);
    }
}
