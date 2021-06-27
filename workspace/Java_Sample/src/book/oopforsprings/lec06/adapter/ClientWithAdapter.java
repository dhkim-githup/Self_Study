package book.oopforsprings.lec06.adapter;

/*
 * 어댑터 패턴을 사용하여, 객체의 메소드를 동일하게 한다.
 * 향후 해당 소스의 runService는 interface 를 이용하여, 어댑터 기능을 사용할 수 있다.
 */
public class ClientWithAdapter {

	public static void main(String[] args) {
		
		AdapterServicA asa1 = new AdapterServicA();
		AdapterServicB asb1 = new AdapterServicB();
		
		asa1.runService();
		asb1.runService();

	}

}
