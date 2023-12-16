package org.example._45_익명내부클래스;

/**
 * 빵형의 실전 Java #045 - 익명 내부 클래스
 * https://www.youtube.com/watch?v=AyEjs9PTXxg&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=47
 */
public class Sample12 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {

            @Override
            public void run() {
                // throw new UnsupportedOperationException("Unimplemented method 'run'");
                System.out.println("익명 내부 클래스");
            }

        };

        r.run();
    }
}
