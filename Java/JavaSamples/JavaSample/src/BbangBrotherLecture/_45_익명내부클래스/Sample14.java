package BbangBrotherLecture._45_익명내부클래스;

public class Sample14 {
    public static void main(String[] args) {

        Greeting2 greeting2 = new Greeting2() {

            @Override
            public String sayHello(String name) {
                return name + " 안녕 !";
            }

            @Override
            public String sayBye() {
                return "잘자 !!!";
            }

        };

        System.out.println(greeting2.sayHello("빵형"));
        System.out.println(greeting2.sayBye());
    }

}

/**
 * Greeting
 */
interface Greeting2 {
    public String sayHello(String name);

    public String sayBye();
}
