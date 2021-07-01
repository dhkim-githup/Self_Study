package book.oopforsprings.lec06.templateCallback;

// 전략을 사용하는 컨텍스트(군인)
public class Soldier2 {
	
	void runContext(String weaponSound) {
		System.out.println("전투 시작");
		executeWeapon(weaponSound).runStrategy();
		System.out.println("전투 종료");
	}

	
	private Strategy executeWeapon(final String weaponSound) {
		return new Strategy() {			
			@Override
			public void runStrategy() {
				System.out.println(weaponSound);				
			}
		};
	}	

}
