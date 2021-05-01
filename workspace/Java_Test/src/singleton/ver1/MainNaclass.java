package singleton.ver1;

public class MainNaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n ================ No Single ==========================");

		// No Single
		NaSingleClassNo na = new NaSingleClassNo();
		NaSingleClassNo na2 = new NaSingleClassNo();
		NaSingleClassNo na3 = new NaSingleClassNo();
		
		na.setStrName("Kim");
		System.out.printf("na ,  %s , %s \n", na, na.getStrName());
		System.out.printf("na2 , %s , %s \n", na2, na2.getStrName());
		System.out.printf("na3 , %s , %s \n", na3, na3.getStrName());
		
		System.out.println("\n ================ No Single ==========================");
		// Single
		NaSingleClass naS = NaSingleClass.getSingleInstance();
		NaSingleClass naS2 = NaSingleClass.getSingleInstance();
		NaSingleClass naS3 = NaSingleClass.getSingleInstance();
		
		naS.setStrName("Lee");
		System.out.printf("naS ,  %s , %s \n", naS, naS.getStrName());
		System.out.printf("naS2 , %s , %s \n", naS2, naS2.getStrName());;
		naS2.setStrName("Lee2");
		System.out.printf("naS2 , %s , %s \n", naS2, naS2.getStrName());;
		System.out.printf("naS3 , %s , %s \n", naS3, naS3.getStrName());;
		System.out.printf("naS ,  %s , %s \n", naS, naS.getStrName());
		
	}

}

