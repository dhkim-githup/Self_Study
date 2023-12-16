package org.example._42_생성자;

public class Data {

    String name;
    int age;

    
    public Data() {
        System.out.println("Data 초기화");
        this.name ="빵형";
        this.age = 21;
    }

    public Data(String name) {
        System.out.println("Data 초기화 2");
        this.name =name;        
    }

    public Data(String name, int age) {
        System.out.println("Data 초기화 3");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {        
        return "Data [name="+this.name+",age="+this.age+"]";
    }
    
}
