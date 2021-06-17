package self._springioc.blog2;

public class MadExample {

    // final로 선언할 수 있는 보너스
    private final HelloService helloService;

    // 단일 생성자인 경우는 추가적인 어노테이션이 필요 없다.
    public MadExample(HelloService helloService) {
        this.helloService = helloService;
    }   
    
    public void doP() {
    	helloService.doPrint1();
    }
    
    
}