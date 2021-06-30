package book.oopforsprings.lec06.factorymethod;

//팩터리 메서드가 생성할 객체의 상위 클래스
public class CatToy extends AnimalToy {

	@Override
	void identify() {
		System.out.println("나는 캣타워! 고양이의 친구!");

	}

}
