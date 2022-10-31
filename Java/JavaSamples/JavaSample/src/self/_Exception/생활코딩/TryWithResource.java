package self._Exception.생활코딩;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        // try with resource statements
        try (FileWriter f = new FileWriter("data.txt")) {
            System.out.println("TryWithResource");
            f.write("Hello");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}