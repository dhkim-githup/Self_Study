package book.oopforsprings.lec06.adapter;

public class ClientWithAdapter {

	public static void main(String[] args) {
		
		AdapterServicA asa1 = new AdapterServicA();
		AdapterServicB asb1 = new AdapterServicB();
		
		asa1.runService();
		asb1.runService();

	}

}
