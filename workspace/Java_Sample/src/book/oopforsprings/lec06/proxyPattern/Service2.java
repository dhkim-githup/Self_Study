package book.oopforsprings.lec06.proxyPattern;

/*
 * Proxy 패턴에 사용할 구현체 
 */
public class Service2 implements IService {

	@Override
	public String runSomething() {
		return "서비스 짱 !!!";
	}
		
}
