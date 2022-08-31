package team._stream.blog1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import team._stream.youtube1.People;

/*
 * stream 을 사용할때 
 */

public class Sample1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Apple", "Ball", "Card", "Driver", "Egg");
		/* 
		 * 기존의 코딩 방식
		 * 'o' 가 있는 문자열을 찾아라
		 */
		long count = 0;
		
		for (String name : names) {
		    if (name.contains("o")) {
		        count++;
		    }
		}
		System.out.println("Count : " + count); // 2
		
		/* Stream 사용 */
		
		System.out.println("------------------stream().filter----------------------"); 
		count = 0;
		count = names.stream().filter(x -> x.contains("o")).count();
		System.out.println("Count : " + count); // 2

		System.out.println("-----------------parallelStream().map ------------------"); 
		names.parallelStream().map(x -> x.concat("s")).forEach(x -> System.out.println(x));
		
		System.out.println("-----------------stream().sort1 ------------------"); 
		names.stream().sorted().forEach(System.out :: println);
		
		System.out.println("-----------------stream().sort2 ----- 아래는 오류,, 재사용안됨..-------------"); 
		Stream<String> s = names.stream().sorted();
		s.forEach(x -> System.out.println(x) );
	
	}

}
