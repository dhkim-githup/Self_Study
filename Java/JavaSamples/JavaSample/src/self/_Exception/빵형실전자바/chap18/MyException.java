package self._Exception.빵형실전자바.chap18;

public class MyException extends Exception{
        MyException(String s){
            super("MyException 처리 =>"+s);
        }
}
