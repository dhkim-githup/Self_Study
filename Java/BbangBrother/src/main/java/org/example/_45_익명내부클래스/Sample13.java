package BbangBrotherLecture._45_익명내부클래스;

public class Sample13 {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() {

            @Override
            public String sayHello(String name) {
                return name + " 안녕 !";
            }
        };

        System.out.println(greeting.sayHello("빵형"));

        Greeting greeting2 = (name) -> name + " 람다식 안녕 !!";
        System.out.println(greeting2.sayHello("빵형"));

    }

}

/**
 * Greeting
 */
interface Greeting {
    public String sayHello(String name);
}
