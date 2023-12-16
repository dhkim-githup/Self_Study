package org.example._47_equals;

public class Sample15 extends Object {

    public static void main(String[] args) {
        System.out.println(new Sample15().toString());

        String A = new String("빵형");
        String B = "빵형";
        String C = "빵형";
        String D = new String("빵형");

        System.out.printf("%s , %s, %s \n", A, B, C);

        if (A == B) {
            System.out.println("A와B는 주소가 같다.");
        } else {
            System.out.println("A와B는 주소가 다르다.");
        }

        if (A.equals(B)) {
            System.out.println("A와B는 값이 같다.");
        } else {
            System.out.println("A와B는 값이 다르다.");
        }

        if (C == B) {
            System.out.println("C와B는 주소가 같다.");
        } else {
            System.out.println("C와B는 주소가 다르다.");
        }

        if (C.equals(B)) {
            System.out.println("C와B는 값이 같다.");
        } else {
            System.out.println("C와B는 값이 다르다.");
        }

    }

}
