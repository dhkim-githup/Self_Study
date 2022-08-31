package book.oopforsprings.lec06.templateCallback;

// 익명 내부 전략을 사용하는 클라이언트
public class Client {
	
	public static void main(String[] args) {
		
	
		Soldier rambo = new Soldier();
		
		// 람보 총을 쏜다.
		rambo.runContext(new Strategy() {			
			@Override
			public void runStrategy() {
				System.out.println("총 ! 총총총!!!");				
			}
		});
		
		System.out.println();
		
		// 람보 칼을 사용
		rambo.runContext(new Strategy() {			
			@Override
			public void runStrategy() {
				System.out.println("칼 ~~~ 칼 ~~~");				
			}
		});
		
		System.out.println();
		
		// 람보 도끼를 사용
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("도끼!!! 도끼.....");
				
			}
		});		
				
	}

}
