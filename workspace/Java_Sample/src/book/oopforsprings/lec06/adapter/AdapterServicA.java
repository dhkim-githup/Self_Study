package book.oopforsprings.lec06.adapter;

public class AdapterServicA {
	
	ServiceA sa1 = new ServiceA();
	
	// 메서드 명을 동일하게 생성한다.
	void runService() {
		sa1.runServiceA();
	}

}
