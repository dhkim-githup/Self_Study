package static_final.main;

import static_final.nomain.*;


public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(StaticSample.inti);
		System.out.println(StaticSample.inti+10);
		
		StaticSample.inti = 20;
		
		
		StaticUse bb = new StaticUse();
		bb.aa();
		
		
		System.out.println(Family.strLove);
		
		System.out.println(Math.PI);
		
		StaticUse.aa();
		
		

	}

}
