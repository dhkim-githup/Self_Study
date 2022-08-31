package team._lamda.standardapi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerSample {

	public static void main(String[] args) {
		
		Consumer<String> consumer = (t) -> System.out.printf("Parameter is %s \n", t);
		consumer.accept("Consumer");
		
		BiConsumer<String, Integer> biConsumer = (t, u) -> {
				String name=t;
				int age = u;
				System.out.printf("Name is %s . Age is %d", name, age);
		};
		
		biConsumer.accept("Hong", 20);
	}

}
