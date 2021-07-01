package book.oopforsprings.lec06.templateCallback;

public class Client2 {
	
	public static void main(String[] args) {
		
	
		Soldier2 rambo = new Soldier2();
		
		// 람보 총을 사용
		rambo.runContext("총 ! 총총총!!!");
		
		System.out.println();
		
		// 람보 칼을 사용
		rambo.runContext("칼 ! 칼~~!!!");
		
		System.out.println();
		
		// 람보 도끼를 사용
		rambo.runContext("도끼.. 도끼..!!!");
				
	}

}
