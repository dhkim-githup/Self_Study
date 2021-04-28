package interfacesample.ver1;

import java.util.Scanner;

public class MainSampleImprovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfSound s = new Bus();
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			
			System.out.println("Input vehicle Sound : ");
			String strSound = scan.next();
			System.out.printf("Input value : %s \n", strSound);
			
			if (strSound.equals("Bus"))       { s = new Bus();		
			}else if (strSound.equals("Car")) { s = new Car();			
			}else if (strSound.equals("Bike")){ s = new Bike();			
			}
			
			// 입력 받은 값이 어떤 값이든, 아래 구문의 s 참조변수는 그대로 사용 가능하다.			
			System.out.printf("Sound : %s \n",doSound(s));
		}
		
			

	}	
	
	public static String doSound(IfSound s) {
		return s.sound();
	}
}

// Interface 
interface IfSound{
	public String sound();
}

// Bus Sound
class Bus implements IfSound{
	
	@Override
	public String sound() {
		return "빠 ~~~앙";
	}
}

// Car Sound
class Car implements IfSound{
	
	@Override
	public String sound() {
		return "빵 빵";
	}
}

// Bike Sound
class Bike implements IfSound{
	
	@Override
	public String sound() {
		return "따릉 따릉";
	}
}