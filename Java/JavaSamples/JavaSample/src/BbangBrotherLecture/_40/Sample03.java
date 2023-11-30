package BbangBrotherLecture._40;

/**
 * - 오버로딩
 * https://www.youtube.com/watch?v=D3OoAXGbnpc&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=42
 */

public class Sample03 {
    public static void main(String[] args) {
        Compute compute = new Compute();

        compute.setValue(4);
        System.out.println(compute.getValue());

        compute.setValue(10, 2);
        System.out.println(compute.getValue());

        System.out.println("빵형");
        System.out.println(1.5f);
        System.out.println(1.6);
    }
}
