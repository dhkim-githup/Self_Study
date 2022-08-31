package self._springioc.blog1;

public class Main2 {

	public static void main(String[] args) {
		//Controller controller = new Controller();
		
		// 어떤 구현체이든, 구현체가 어떤방법으로 구현되든 Service 인터페이스를 구현하기만 하면 된다.
		Controller2 controller1 = new Controller2(new ServiceImpl1());
		
		Controller2 controller2 = new Controller2(
	            () -> System.out.println("Lambda implementation is doing something")
	        );
	        Controller2 controller3 = new Controller2(new Service() {
	            @Override
	            public void doSomething() {
	                System.out.println("Anonymous class is doing something");
	            }
	        });

	        controller1.callService();
	        controller2.callService();
	        controller3.callService();
		
	}

}
