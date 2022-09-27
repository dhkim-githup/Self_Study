package self.reflection.yeon;

public class Dog extends Animal {
    private String myName = "뽀삐";
    public  String myCity = "서울";

    public Dog() {
    }

    private Dog(String myName) {
        this.myName = myName;
    }

    private void myName(String name){
        System.out.println("myName : " + name);
    }

    private void myCity(String city){
        System.out.println("myCity : " + city);
    }

    private void hello(){
        System.out.println("hello~");
    }
}
