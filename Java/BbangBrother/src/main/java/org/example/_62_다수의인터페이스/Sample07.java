package org.example._62_다수의인터페이스;

public class Sample07 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.study();

        Person2 person2 = new Person2();
        person2.teach();

        Person3 person3 = new Person3();
        person3.study();
        person3.teach();
    }
}

interface Student{
    void study();
}

interface Teacher{
    void teach();
}

class Person1 implements Student{

    @Override
    public void study() {
        System.out.println("Person1 이 공부한다.");

    }
}

class Person2 implements Teacher{

    @Override
    public void teach() {
        System.out.println("Person2 가 가르친다.");
    }
}

class Person3 implements Student, Teacher{

    @Override
    public void study() {
        System.out.println("Person3 이 공부한다.");
    }

    @Override
    public void teach() {
        System.out.println("Person3 이 가르친다.");
    }
}