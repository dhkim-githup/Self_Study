package BbangBrotherLecture._49_객체Object;

import java.util.Arrays;

public class Sample18 {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("빵형", 21, 1);
        students[1] = new Student("빵형2", 22, 2);
        students[2] = new Student("빵형3", 23, 3);

        // For 문
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("-------------------------");

        // 향상된 For 문
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        // Stream 람다식
        Arrays.stream(students)
                .forEach(s -> System.out.println(s));
        System.out.println("-------------------------");

        // Stream 메서드 참조
        Arrays.stream(students)
                .forEach(System.out::println);
    }
}

class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }

}
