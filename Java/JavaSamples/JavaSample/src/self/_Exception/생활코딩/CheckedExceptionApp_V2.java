package self._Exception.생활코딩;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp_V2 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("data.txt");
            f.write("Hello");
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            // 만약에 f가 null이 아니라면
            if(f  != null) {
                try {
                    f.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
