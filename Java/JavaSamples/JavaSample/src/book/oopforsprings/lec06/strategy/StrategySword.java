package book.oopforsprings.lec06.strategy;

// 전략 인터페이스 구현
public class StrategySword implements Strategy{

	@Override
	public void runstrategy() {
		System.out.println("챙.. 채재챙, 챙챙");		
	}
}
