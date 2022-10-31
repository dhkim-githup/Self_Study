package self._Exception.생활코딩;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp_V1 {
    public static void main(String[] args) {
        try {
            System.out.println("CheckedExceptionApp");
            FileWriter f = new FileWriter("data.txt");
            f.write("Hello");
            // close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 합니다.
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}