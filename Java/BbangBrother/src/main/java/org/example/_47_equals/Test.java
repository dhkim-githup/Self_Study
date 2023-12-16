package org.example._47_equals;

/**
 * 빵형의 실전 Java #047 - 객체(Object) equals( )
 * https://www.youtube.com/watch?v=LCCsmw8Valg&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=49
 */

public class Test {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();

        data1.setName("빵형");
        data2.setName("빵형");

        System.out.println(data1.getName());
        System.out.println(data2.getName());

        if (data1 == data2) {
            System.out.println("data1와data2는 주소가 같다.");
        } else {
            System.out.println("data1와data2는 주소가 다르다.");
        }

        if (data1.equals(data2)) {
            System.out.println("data1와data2는 값이 같다.");
        } else {
            System.out.println("data1와data2는 값이 다르다.");
        }

        if (data1.getName() == data2.getName()) {
            System.out.println("data1와data2는 주소가 같다.");
        } else {
            System.out.println("data1와data2는 주소가 다르다.");
        }

        if (data1.getName().equals(data2.getName())) {
            System.out.println("data1와data2는 값이 같다.");
        } else {
            System.out.println("data1와data2는 값이 다르다.");
        }

    }
}
