package team._lamda;

public class LamdaSample {

	public static void main(String[] args) {
				
		Calcul calcul = (int a, int b) -> a>b ?a:b;

	}

}

@FunctionalInterface
interface Calcul{
	int max(int a, int b);
}