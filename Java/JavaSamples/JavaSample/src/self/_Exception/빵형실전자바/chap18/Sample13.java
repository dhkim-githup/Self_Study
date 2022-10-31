package self._Exception.빵형실전자바.chap18;

import java.util.Arrays;
import java.util.List;

public class Sample13 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("인디안밥", "고래밥", "허니버터칩");
        try {
            System.out.println("======= main 1 ======");
            hasBread(list);
        }
        catch(Exception e) {
            System.out.println("======= main 2 ======");
            System.out.println(e.getMessage());
            System.out.println("======= main 3 ======");
        }
    }

    public static boolean hasBread(List<String> list) throws MyException {
        System.out.println("======= hasBread 1 ======");
        if(!list.contains("빵")) {
            System.out.println("======= hasBread 2 ======");
            throw new MyException("빵이 없어요.");
        }
        System.out.println("======= hasBread 3 ======");
        return true;
    }

}

class BreadException extends RuntimeException {

    public BreadException() {
        super("빵이 포함되지 않는 치명적인 오류가 발생했습니다.");
        System.out.println("======= BreadException 1 ======");
    }

}