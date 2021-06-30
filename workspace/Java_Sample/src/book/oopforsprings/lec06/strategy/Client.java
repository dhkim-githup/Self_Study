package book.oopforsprings.lec06.strategy;

public class Client {
	
	public static void main(String[] args) {
		
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		// 총을 람보에게 전달, 전투 수행
		strategy = new StrategyGun();
		rambo.runContext(strategy);
		System.out.println();
		
		// 검을 람보에게 전달, 전수 수행
		strategy = new StrategySword();
		rambo.runContext(strategy);
		System.out.println();
		
		// 활을 람보에게 전달, 전수 수행
		strategy = new StrategyBow();
		rambo.runContext(strategy);
		System.out.println();
				
	}

}
