package book.oopforsprings.lec05.solid;

public class ISP남자_OK {

	public static void main(String[] args) {
		
		I남편 i남편 = new 남자3();
		  i남편.기념일챙기기();
 		
		I아들 i아들 = new 남자3();
		 i아들.효도하기();
	}

}

/* 각각의 최소단위의 인터페이스로 분리 interface 생성 */
interface I아들{ 	void 효도하기(); }
interface I남편{  void 기념일챙기기(); }
interface I아빠{ 	void 용돈주기(); }
interface I친구{  void 운동하기(); }


/* 의미가 명확치 않은 인터페이스 상속 */
class 남자3 implements I남편,I아들,I아빠,I친구{

	@Override
	public void 용돈주기() {
		System.out.println("애들에게 용돈을");	
	}

	@Override
	public void 운동하기() {
		System.out.println("친구들과 운동을");		
	}

	@Override
	public void 효도하기() {
		System.out.println("엄마에게 효도를");		
	}

	@Override
	public void 기념일챙기기() {
		System.out.println("아내와의 기념일 챙기기");
		
	}
	
}
