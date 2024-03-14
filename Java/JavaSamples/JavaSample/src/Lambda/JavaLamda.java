package Lambda;

import java.util.ArrayList;

public class JavaLamda {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n) -> System.out.println(n));

        System.out.println("------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------");

        for (Integer n : numbers) {
            System.out.println(n);
        }

    }

}
