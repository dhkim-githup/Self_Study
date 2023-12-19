package org.example._54_Lombok;

import lombok.RequiredArgsConstructor;

public class Sample26 {

    public static void main(String[] args) {

    }
}

@RequiredArgsConstructor
class Person{
    private final int no;
    private String name;
    private String phone;

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
