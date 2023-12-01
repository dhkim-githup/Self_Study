package BbangBrotherLecture._38_멤버변수;

/**
 * 멤버변수
 * https://www.youtube.com/watch?v=YLhTN-klTqo&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=40
 */

public class Sample02 {
    public static void main(String[] args) {
        Vo vo = new Vo();
        vo.name = "빵형";
        vo.age = 21;

        System.out.printf("%s은(는) %d살\n", vo.name, vo.age);
        System.out.printf("%d + %d = %d", Vo.ONE, Vo.TWO, Vo.ONE + Vo.TWO);
    }
}
