package team._stream.youtube1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Sample 1 , for 이용 */
		System.out.println("남성 or 여성");
		for(People people : People.getPeopleList()) {
			if(people.getGender().equals("Male")) {
				System.out.println(people);				
			}
		}
		
		System.out.println("----------------- Use stream().fileter() ------------------------");
		
		/*
		 * 1. People.getPeopleList() 를 통해 Arraylist 를 반환한다.
		 * 2. stream() 객체의 filter 메서드를 사용하여 () 안의 값이 true 이면 다음 collect 를 실행한다.
		 * 3. collect() 함수는 해당 리스트를 반환해준다.
		 */
		List<People> femaleList = People.getPeopleList().stream().filter(people 
				                  -> people.getGender().equals("Female")).collect(Collectors.toList());
		
		/*
		 * femaleList 객체에 있는 만큼 값을 people 참조변수가 받아서 실행한다. 
		 * people 은 toString() 메서드를 호출한다.
		 */
		for(People people : femaleList) {
			System.out.println(people);				
		}
		
		System.out.println("----------------- Use forEach() Lamda ------------------------");
		
		/* forEach 람다식 이용  */
		femaleList.forEach(s->System.out.println(s));
		/* Lamda 식 생략 */
		femaleList.forEach(System.out::println);
		
		System.out.println("----------------- Use forEach() Lamda ------------------------");
		
		/* forEach 람다식 이용  */
		femaleList.forEach(s->System.out.println(s));
		/* Lamda 식 생략 */
		femaleList.forEach(System.out::println);
		
		
		System.out.println("----------------- stream().sorted() 정렬 , 나이순  ------------------------");
		List<People> femaleSort = 
				People.getPeopleList().stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
		/* Lamda 식 생략 */
		femaleSort.forEach(System.out::println);
		
		
		System.out.println("----------------- stream().allMatch() , 전체조건 만족식   ------------------------");
		boolean allMatch = 
				People.getPeopleList().stream().allMatch(people -> people.getAge()>17);
		/* Lamda 식 생략,모두 12살이 넘는가? */
		System.out.println(allMatch);
		
		
		System.out.println("----------------- stream().anyMatch() , 하나라도 조건 만족식   ------------------------");
		boolean anyMatch = 
				People.getPeopleList().stream().anyMatch(people -> people.getAge()>17);
		/* Lamda 식 생략, 하나라도 17살이 넘는 사람이 있는가? */
		System.out.println(anyMatch);
		
		
		System.out.println("----------------- stream().noneMatch() , 한사람도 없다면 조건 만족식   ------------------------");
		boolean noneMatch = 
				People.getPeopleList().stream().noneMatch(people -> people.getAge()>15);
		/* Lamda 식 생략, 하나라도 18살이 넘는 사람이 있는가? */
		System.out.println(noneMatch);

		
		System.out.println("----------------- stream().max() , 가장 큰값을 가져온다.    ------------------------");
		Optional<People> maxPeople = 
				People.getPeopleList().stream().max(Comparator.comparing(People::getAge));
		
		if (maxPeople.isPresent()) {
			System.out.println("나이가 제일 많은 사람");
			System.out.println(maxPeople.get());
		}
		
		
		System.out.println("----------------- stream().min() , 가장 작은값을 가져온다.    ------------------------");
		Optional<People> minPeople = 
				People.getPeopleList().stream().min(Comparator.comparing(People::getAge));
		
		if (minPeople.isPresent()) {
			System.out.println("나이가 제일 적은 사람");
			System.out.println(minPeople.get());
		}
		
		System.out.println("----------------- groupingBy(), Map 특정 필드의 그룹을 만들 수 있다..    ------------------------");
		Map<String, List<People>> groupByGender = 
				People.getPeopleList().stream().collect(Collectors.groupingBy(People::getGender));
		
		System.out.println("남성/여성 목록");
		
		groupByGender.forEach((gender, peopleList) -> {
			System.out.println(gender);
			peopleList.forEach(System.out::println);
		});
		
		
		System.out.println("----------------- 복합적인 사용 , 여성들중 나이가 가장 많은 사람의 이름을 반환.    ------------------------");
		
		Optional<String> oldestFemale = 
				People.getPeopleList().stream().filter(people -> people.getGender().equals("Female")).max(Comparator.comparing(People::getAge)).map(People::getName);
		
		System.out.println("여성들 중 가장 나이가 많은 사람의 이름은 ");
		oldestFemale.ifPresent(System.out :: println);
		
	}

}
