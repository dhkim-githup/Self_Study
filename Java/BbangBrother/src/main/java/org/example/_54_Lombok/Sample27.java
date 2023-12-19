package org.example._54_Lombok;

import lombok.*;

public class Sample27 {

    public static void main(String[] args) {
        System.out.println("Hello Main Test");

        Person54 person54 = new Person54(1,"홍길동","000-0000");

        System.out.println(person54.toString());

        Person54 per1 = Person54.builder()
                .no(33)
                .name("홍길동")
                .build();

        System.out.println(per1.toString());


        Person54 per3 = Person54.builder()
                .no(33)
                .name("홍길동")
                .phone("000-00000000000")
                .build();

        System.out.println(per3.toString());

    }
}


@ToString
@AllArgsConstructor
@Builder
class Person54{
    private final int no;
    private String name;
    private String phone;
}
