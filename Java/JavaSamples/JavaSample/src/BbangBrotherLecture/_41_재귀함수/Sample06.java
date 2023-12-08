package BbangBrotherLecture._41_재귀함수;

/**
 * 빵형의 실전 Java #041 - 재귀함수
 * https://www.youtube.com/watch?v=mY78WZ4H7_E&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=43
 */
public class Sample06 {

    static int sum;

    public static void main(String[] args) {

        System.out.println("Sum =>" + (int) sum(10));
    }

    public static int sum(int a) {

        System.out.println("int a " + (int) a);
        sum += a;

        if (a == 0) {
            return sum;
        } else {
            return sum(--a);
        }

    }

}
