package book.oopforsprings.lec05.solid;

public class ISP남자_NO {

	public static void main(String[] args) {
		
		/* 돌아는 간다 */
		아들_남편 아남 = new 남자2();
		 아남.기념일챙기기();
		 아남.효도하기();
	}

}

/* 아들 과 남편의 상관없는 interface 생성 */
interface 아들_남편{
	void 효도하기();
	void 기념일챙기기();
}

/* 아빠 와 친구의 상관없는 interface 생성 */
interface 아빠_친구{
	void 용돈주기();
	void 운동하기();
}

/* 의미가 명확치 않은 인터페이스 상속 */
class 남자2 implements 아들_남편, 아빠_친구{

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
