package BbangBrotherLecture._46_정적중첩클래스;

public class Student {

    static String name;
    int age;

    public Student(String name) {
        this.name = name;
    }

    public static class Score {
        int eng;
        int mat;

        public Score(String name) {
            Student.name = name;
        }

        public void showInfo() {
            System.out.printf("이름 : %s \n", name);
            System.out.printf("영어 : %s \n", eng);
            System.out.printf("수학 : %s \n", mat);
        }
    }

}
