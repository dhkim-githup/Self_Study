package self.reflection.yeon;

public class MainSample {

    public static void main(String[] args) throws ClassNotFoundException {

        /* Case 01 - class를 알고 있다는 전제
            아래 코드를 보시면 Dog.class 처럼 클래스 정보를 할당할 수 있습니다.
            Class객체는 여러 메서드를 제공하고 있으며 getName()은 클래스의 이름을 리턴합니다.


        Class cls = Dog.class;
        System.out.println("Class Name : " + cls.getName());
        */

        /*
        Case 02 - class를 참조할 수 없고 이름만 알고 있는 상황이라면?

        아래 예제는 클래스 이름만으로 클래스의 정보를 가져옵니다.
        Class,forName() 메서드에 클래스 이름을 인자로 전달하여 클래스 정보를 가져올 수 있습니다.
        패키지 네임이 포함된 클래스 이름으로 작성해야 합니다.
        */
        Class cls = Class.forName("self.reflection.yeon.Dog");

        System.out.println("Class Name : " + cls.getName());


    }
}
