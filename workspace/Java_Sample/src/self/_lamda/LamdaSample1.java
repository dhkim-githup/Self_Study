package self._lamda;

public class LamdaSample1  {

	public static void main(String[] args) {
		
		
		/* void 형태 */
		
		// 1. 익명클래스 
		InfSample1 a1 = new InfSample1() {			
			@Override
			public void doPrint() {
				System.out.println("나는 익명 1 함수");
			}
		};
		
		a1.doPrint();
		
		// 1. 람다식 
		InfSample1 b1 = () -> System.out.println("나는 람다 1 함수");
		
		b1.doPrint();
				
		
		/*----------------------------------------------*/
		/* 리턴형 , 인자값 포함  */
		
		// 1. 익명클래스 \		
	   InfSample2 a2 = new InfSample2() {			
			@Override
			public String doPrint(String name, int age) {
				return "이름 :"+name+" , 나이 :"+Integer.toString(age);			
			}
		};
		
		System.out.println(a2.doPrint("홍길동",30));
		
		// 1. 람다식 
		InfSample2 b2 = (name, age) ->{
			return "이름 :"+name+" , 나이 :"+Integer.toString(age);	
		};
		
		System.out.println(b2.doPrint("김람다",20));
				
		

	}

}

/* void 인터페이스 형식 
 * @FunctionalInterface 를 표기하는 이유 ? 
 *    -> 람다식을 사용할거니까, 메서드를 하나만 사용해야 한다는 약속의 표기
 * */
@FunctionalInterface
 interface InfSample1{
	public void doPrint();	
}

/* 리턴형 , 인자값 포함
 * @FunctionalInterface 를 표기하는 이유 ? 
 *    -> 람다식을 사용할거니까, 메서드를 하나만 사용해야 한다는 약속의 표기
 * */
@FunctionalInterface
interface InfSample2{
	public String doPrint(String name, int age);	
}
