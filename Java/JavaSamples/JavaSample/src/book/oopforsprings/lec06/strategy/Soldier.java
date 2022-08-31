package book.oopforsprings.lec06.strategy;

// 전략을 사용하는 컨텍스트(군인)
public class Soldier {
	
	void runContext(Strategy strategy) {
		System.out.println("전투 시작");
		strategy.runstrategy();
		System.out.println("전투 종료");
	}

}
