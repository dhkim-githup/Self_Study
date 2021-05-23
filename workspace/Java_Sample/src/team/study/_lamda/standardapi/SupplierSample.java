package team.study._lamda.standardapi;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierSample {
	
	public static void main(String[] args) {
		
		//Supplier<String> supplier = () -> { return "Hello Supplier"; };		
		Supplier<String> supplier = () -> "Hello Supplier";
		System.out.println(supplier.get());
		
		IntSupplier intSupplier = () -> {
			return 20;
		};
		System.out.println(intSupplier.getAsInt());
		
	}

}
