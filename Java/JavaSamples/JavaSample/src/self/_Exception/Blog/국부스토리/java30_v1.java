package self._Exception.Blog.국부스토리;

public class java30_v1 {

    public static void main(String[] args) {
        Test test = new Test();

        try {
            test.test("1", "a");
        } catch (Exception e) {
            System.out.println("입력하신 값은 숫자가 아닙니다.");
        }
    }

    static class Test {
        public void test(String a, String b)  {
            System.out.println("Test.test");
            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            System.out.println("문자로 입력받은 " + a + "," + b + " 의 합은 " + sum + "입니다.");
        }
    }
}
