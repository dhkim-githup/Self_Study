package org.example._43_내부클래스;

public class Student {
    
    String name;
    int age;


    public Student(String name) {
        this.name = name;        
    }

    public class Score{
        int eng;
        int mat;

        public void showInfo(){
            System.out.printf("이름 : %s \n", name);
            System.out.printf("영어 : %s \n", eng);
            System.out.printf("수학 : %s \n", mat);

        }
    }

}
