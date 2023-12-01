package BbangBrotherLecture._43_내부클래스;

public class Sample10 {
    
    public static void main(String[] args) {
        Student student = new Student("홍길동");    
        Student.Score score = student.new Score();
        score.eng=23;
        score.mat=21;

        score.showInfo();
    }
    

}
