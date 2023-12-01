package BbangBrotherLecture._40_오버로드;

/**
 * - 가변인자
 * https://www.youtube.com/watch?v=D3OoAXGbnpc&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=42
 */

public class Sample04 {

    static int total = 0;

    public static void main(String[] args) {
        // System.out.printf("결과 : %d \n", sum(1));

        // System.out.printf("결과 : %d \n", sum(2, 3));

        System.out.printf("가변인자 : %d \n", sum(2, 3, 4, 5, 6));
    }

    /*
     * public static int sum(int a) {
     * total += a;
     * return total;
     * }
     * 
     * public static int sum(int a, int b) {
     * total += a + b;
     * return total;
     * }
     */
    public static int sum(int... a) {
        for (int i : a) {
            total += i;
        }
        return total;
    }

}
