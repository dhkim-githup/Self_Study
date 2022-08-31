package self._springioc.blog1;

public class Controller2 {
	
	private Service service;
	
	public Controller2(Service service) {	
		this.service = service;
	}



	public void callService() {
	        service.doSomething();
	 }
}
