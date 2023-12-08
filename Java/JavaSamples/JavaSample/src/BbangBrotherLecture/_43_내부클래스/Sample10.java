package BbangBrotherLecture._43_내부클래스;

/**
 * 빵형의 실전 Java #043 - 인스턴스 내부 클래스
 * https://www.youtube.com/watch?v=ZfyZcurXdIc&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=45
 */
public class Sample10 {

    public static void main(String[] args) {
        Student student = new Student("홍길동");
        Student.Score score = student.new Score();
        score.eng = 23;
        score.mat = 21;

        score.showInfo();
    }

}
