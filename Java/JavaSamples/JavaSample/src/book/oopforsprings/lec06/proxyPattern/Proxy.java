package book.oopforsprings.lec06.proxyPattern;

/*
 * Proxy 패턴에 사용할 구현체 
 */
public class Proxy implements IService {
	
	/* Proxy 패턴을 이용한, 대리객체 이용 */
	IService service2;

	@Override
	public String runSomething() {
		System.out.println("호출에 대한 흐름 제어가 주목정, 반환 결과를 그대로 전달");
		
		service2 = new Service2();
		
		return service2.runSomething();
		
	}
}
