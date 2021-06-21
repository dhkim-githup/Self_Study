package book.oopforsprings.lec06.adapter;

public class AdapterServicA {
	
	ServiceA sa1 = new ServiceA();
	
	void runService() {
		sa1.runServiceA();
	}

}
