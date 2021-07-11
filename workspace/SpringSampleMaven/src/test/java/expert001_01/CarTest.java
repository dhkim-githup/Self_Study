package expert001_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.study.demo._springoop.chap07iocdi.expert001_01.Car;

public class CarTest {

	@Test 
	public void carTest() {
		Car car = new Car();
		
		assertEquals("장착된 타이어 : 코리아 타이어", car.getTireBrand());
	}
	
}
