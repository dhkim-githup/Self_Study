package BbangBrotherLecture;

public class Java101_Lamda1 {

    public static void main(String[] args) {
        //Sample01Function sample01Function = () -> System.out.println("Sample01Test");
        Sample01Function sample01Function = () -> {
            System.out.println("Sample01Test");
        };

        sample01Function.test();

        Sample01Function f2 = new Sample01Function() {
            @Override
            public void test() {
                System.out.println("Sample02Test");
            }
        };

        f2.test();
        System.out.println("===========================================");



        Sample02Function sample02Function = (a) -> a;
        System.out.println(sample02Function.test("Hello"));

        Sample02Function f4 = a -> {
            return a;
        };

        System.out.println(f4.test("Hello World"));

    }
}


@FunctionalInterface
interface Sample01Function{
    public void test();
}

@FunctionalInterface
interface Sample02Function{
    public String test(String a);
}