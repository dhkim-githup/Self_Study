package org.example._42_생성자;

/**
 * 빵형의 실전 Java #042 - 생성자
 * https://www.youtube.com/watch?v=35zSG_JtmzI&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=44
 */

public class Sample07 {

    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data.toString());

        Data data2 = new Data("빵형");
        System.out.println(data2.toString());

        Data data3 = new Data("빵형", 22);
        System.out.println(data3.toString());
    }
}
