package BbangBrotherLecture._51_캡슐화.Sample21;

public class PrintServiceImpl {

    public static DataServiceImpl data = new DataServiceImpl();

    public void printMessage() {
        System.out.printf("Hello !! %s", data.getName());
    }
}
