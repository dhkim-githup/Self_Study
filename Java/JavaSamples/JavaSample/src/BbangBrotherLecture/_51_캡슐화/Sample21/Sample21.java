package BbangBrotherLecture._51_캡슐화.Sample21;

/**
 * 빵형의 실전 Java #051 - 캡슐화
 * https://www.youtube.com/watch?v=pMzVoI90UYk&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=53
 */

public class Sample21 {

    public static DataServiceImpl data = new DataServiceImpl();
    public static PrintServiceImpl print = new PrintServiceImpl();

    public static void main(String[] args) {
        // String name = data.getName();
        print.printMessage();
    }
}
