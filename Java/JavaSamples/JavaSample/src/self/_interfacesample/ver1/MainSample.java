package self._interfacesample.ver1;

public class MainSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusTmp bus = new BusTmp();
		 	System.out.printf("Bus Sound : %s \n",bus.sound());
		 	
		CarTmp car = new CarTmp();
			System.out.printf("Car Sound : %s \n",car.sound());			
			
		BikeTmp bike = new BikeTmp();
		    System.out.printf("Bike Sound : %s \n",bike.sound());	

	}	
}

// Bus Sound
class BusTmp{
	public String sound() {
		return "빠 ~~~앙";
	}
}

// Car Sound
class CarTmp{
	public String sound() {
		return "빵 빵";
	}
}

// Bike Sound
class BikeTmp{
	public String sound() {
		return "따릉 따릉";
	}
}