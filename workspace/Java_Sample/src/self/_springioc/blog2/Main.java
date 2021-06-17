package self._springioc.blog2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 생성자를 통한 주입 */
		MadExample madExample = new MadExample(new HelloService());
		madExample.doP();
		
		/* 수정자를 통한 주입 */		
		MadExample2 madExample2 = new MadExample2();
		madExample2.setService(new HelloService());
		madExample2.doP();		
	}
	
}
