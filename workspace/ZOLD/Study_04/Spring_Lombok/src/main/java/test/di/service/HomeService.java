package test.di.service;

import org.springframework.stereotype.Service;

import test.di.vo.BreadVo1;
import test.di.vo.BreadVo2;
import test.di.vo.BreadVo3;

@Service
public class HomeService {

	public void backHome(){
		
		BreadVo1 vo1 = new BreadVo1();
		
		vo1.setName("홍길동");
		vo1.setAge(20);
		//System.out.println(vo1.getName() + "제발 퇴근하자  ~~");
		System.out.printf("%s 제발 퇴근하자 !\n" , vo1.getName());
		
		BreadVo2 vo2 = new BreadVo2("홍길순",15);
		System.out.printf("%s 제발 퇴근하자 !\n" , vo2.getName());
		
		BreadVo3 vo3 = BreadVo3.builder()
							   .age(20)
							   .name("홍길동순")
							   .build();
							   
		System.out.printf("%s 제발 퇴근하자 --vo3 !\n" , vo3.getName());
		
	}
	
}
