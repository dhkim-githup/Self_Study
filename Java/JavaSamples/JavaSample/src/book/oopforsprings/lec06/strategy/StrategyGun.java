package book.oopforsprings.lec06.strategy;

// 전략 인터페이스를 구현
public class StrategyGun implements Strategy {

	@Override
	public void runstrategy() {
		System.out.println("탕, 타당, 타다당");		
	}

}
