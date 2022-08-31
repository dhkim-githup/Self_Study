package self._springioc.blog2;

public class MadExample2 {

    // final로 선언할 수 없다. 
    private HelloService helloService;

    public void setService(HelloService helloService) {
        this.helloService = helloService;
    }
  
    public void doP() {
    	helloService.doPrint2();
    }
    
}