package BbangBrotherLecture._38_멤버변수;

/**
 * https://www.youtube.com/watch?v=SlZepEBIrvg&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=39
 */
public class Youtube38 {

    /* 필드영역 */
    public String name = "멤버변수";

    /* 메소드 영역 */

    public static void main(String[] args) {

        Youtube38 youtube38 = new Youtube38();
        youtube38.sayHello();
        youtube38.sayHello("길동");

    }

    private void sayHello() {
        String friend = "친구야";
        System.out.printf("%s 안녕?\n", friend);
    }

    private void sayHello(String friend) {
        System.out.printf("%s 안녕?\n", friend);
    }

}
