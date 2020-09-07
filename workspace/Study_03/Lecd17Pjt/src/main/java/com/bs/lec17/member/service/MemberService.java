package com.bs.lec17.member.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bs.lec17.member.Member;
import com.bs.lec17.member.dao.MemberDao;

//@Component 
//@Repository("memService")  // 객체 이름을 지정하고, 해당 객체를 사용하는곳에서 해당 객체명 사용  => @Resource(name="memService")
@Service /* 너는 서비스 객체가 될거야. 자동으로 스프링 컨테이너에 포함 */
public class MemberService implements IMemberService {

	@Autowired
	MemberDao dao;
	
	@Override
	public void memberRegister(String memId, String memPw, String memMail,
			String memPhone1, String memPhone2, String memPhone3) {
		System.out.println("memberRegister()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);
		
		dao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
	}

	@Override
	public Member memberSearch(String memId, String memPw) {
		System.out.println("memberSearch()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		
		Member member = dao.memberSelect(memId, memPw);
		
		return member;
	}

	@Override
	public void memberModify() {
		
	}

	@Override
	public void memberRemove() {
		
	}

}