package org.example._46_정적중첩클래스;

/**
 * 빵형의 실전 Java #046 - 정적 중첩 클래스
 * https://www.youtube.com/watch?v=n_Ak5IwkDd8&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=48
 */

public class Sample15 {

    public static void main(String[] args) {
        Student.Score score = new Student.Score("빵형");

        score.eng = 23;
        score.mat = 21;

        score.showInfo();
    }

}
