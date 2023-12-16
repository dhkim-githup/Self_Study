package org.example._47_equals;

/**
 * 빵형의 실전 Java #047 - 객체(Object) equals( )
 * https://www.youtube.com/watch?v=LCCsmw8Valg&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=49
 */

public class Sample16 {
    public static void main(String[] args) {
        System.out.println(new Sample16().toString());

        String a = new String("빵형");
        String b = "빵형";
        String c = "빵형";
        String d = new String("강형");

        if (a == b) {
            System.out.println("a 와 b 는 주소가 같다");
        } else {
            System.out.println("a 와 b 는 다른 주소다");
        }

        if (a.equals(b)) {
            System.out.println("a 와 b 는 값이 같다");
        } else {
            System.out.println("a 와 b 는 값이 다르다");
        }

        System.out.println("=========================");

        if (b == c) {
            System.out.println("b 와 c 는 주소가 같다");
        } else {
            System.out.println("b 와 c 는 다른 주소다");
        }

        if (b.equals(c)) {
            System.out.println("b 와 c 는 값이 같다");
        } else {
            System.out.println("b 와 c 는 값이 다르다");
        }

        System.out.printf("%s , %s , %s", a, b, c);
    }
}
