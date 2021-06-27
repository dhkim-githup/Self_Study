package book.oopforsprings.lec06.adapter;

public class AdapterServicB {

	ServiceB sb1 = new ServiceB();
	
	// 메서드 명을 동일하게 생성한다.
	void runService() {
		sb1.runServiceB();
	}
}
