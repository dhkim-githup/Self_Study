package book.oopforsprings.lec05.solid;

public class DIP커피_OK {

	public static void main(String[] args) {
		
		/* 월요일 */
		직장인2 man = new 직장인2();
			man.doCoffee();
		
	}
}

/* 특정 커피에 상속되면,, 다른 커피를 마실때는.. 
 * 
 * */
class 직장인2{
	/* 월요일 */
	//커피 coffee = new 아메2();	
	
	/* 화요일 */
	커피 coffee = new 라떼2();	
	
	void doCoffee() {
		System.out.println(coffee.doDrink());
	}
}

interface 커피{
	String doDrink();
}


class 아메2 implements 커피{
	public String doDrink(){
		return "아메를 마신다.";
	}
}

class 라떼2 implements 커피{
	public String doDrink(){
		return "라떼를 마신다.";
	}
}

class 카푸치노2 implements 커피{
	public String doDrink(){
		return "카푸치노를 마신다.";
	}
}
