package book.oopforsprings.lec05.solid;

public class DIP커피_NO {

	public static void main(String[] args) {
		
		/* 월요일 */
		직장인 man = new 직장인();
		    man.doDrink();
		
		/* 화요일은  라떼를 마시고 싶다. */    
		    
	}
}

/* 특정 커피에 상속되면,, 다른 커피를 마실때는.. */
class 직장인 extends 아메{	
}



class 아메{
	void doDrink(){
		System.out.println("아메를 마신다.");
	}
}

class 라떼{
	void doDrink(){
		System.out.println("라떼를 마신다.");
	}
}

class 카푸치노{
	void doDrink(){
		System.out.println("카푸치노를 마신다.");
	}
}


