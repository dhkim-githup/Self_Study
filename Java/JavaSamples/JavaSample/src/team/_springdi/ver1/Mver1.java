package team._springdi.ver1;

/**
 * Dependency 의존관계
 * 모닝커피를 마시자. 스벅에서
 * 주문을 한다. ( 메뉴는  1-아메리카노 , 2-돌체라떼, 3-카푸치노 ) * 
 * @author PC
 *
 */
public class Mver1 {
	 
	public static void main(String[] args) {
		
		/* 외부 클래스 커피에 의존(Dependency) 한다. 
		 * 외부에서 가져오지 말고, 직접 생성하여 만들자
		 */
		Americano ame 		= new Americano();
		Latte latte   		= new Latte();
		Cappuccino cappu	= new Cappuccino();
				
		int menu; // 커피 메뉴  :  1-아메리카노 , 2-돌체라떼, 3-카푸치노
		
		/* 커피 주문에 따른 메서드 호출 */
		menu=2; // 아메리카노 
		
		/* 커피 나왔어요.. */
		if(menu==1) {
			System.out.println(ame.toString());
		}else if(menu==2) {
			System.out.println(latte.toString());
		}else if(menu==3) {
			System.out.println(cappu.toString());
		}
	}
}
