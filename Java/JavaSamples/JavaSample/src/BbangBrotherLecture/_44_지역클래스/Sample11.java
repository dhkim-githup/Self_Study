package BbangBrotherLecture._44_지역클래스;

/**
 * 빵형의 실전 Java #044 - 지역 클래스(Local Inner Classes)
 * https://www.youtube.com/watch?v=0M5JoiHHpvw&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=46
 */

public class Sample11 {

    void localMethod() {
        int age = 23;

        class LocalClasss {
            public void howOldAreYou() {
                System.out.printf("빵형은 %d", age);
            }
        }

        LocalClasss innerClasss = new LocalClasss();
        innerClasss.howOldAreYou();
    }

    public static void main(String[] args) {

        Sample11 sample11 = new Sample11();
        sample11.localMethod();

    }
}
