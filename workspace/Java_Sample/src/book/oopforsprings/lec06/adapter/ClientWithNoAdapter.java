package book.oopforsprings.lec06.adapter;

/*
 * 어댑터 패턴을 사용하지 않음.
 */
public class ClientWithNoAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServiceA sa1 = new ServiceA();
		ServiceB sb1 = new ServiceB();	
		
		sa1.runServiceA();
		sb1.runServiceB();

	}

}
