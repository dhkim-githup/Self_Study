package com.example.sample.model2.jdbc.service;

import java.util.ArrayList;
import java.util.List;

import com.example.sample.model2.jdbc.dao.Dao_People;
import com.example.sample.model2.vo.Vo_People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Sv_People implements Sv_IfPeople {
	
	Dao_People dao_People;
	
	@Autowired
	public Sv_People(Dao_People dao_People) {
		this.dao_People = dao_People;
	}

	/* People 의 값을 전부 가져오는 메서드 */
	@Override
	public List<Vo_People> doReadList() {
		
		List<Vo_People> list = dao_People.doReadList();
		
		return list;
	}

	/* 특정 ID 값을 져오는 메서드 */
	@Override
	public Vo_People doReadId(String id) {
		
	  Vo_People vo_People =null;	
	  
	  /* data 유효성 검증 */
	  if(id != null) {	
		vo_People = dao_People.doReadId(id);
	  }else {
		vo_People = null;  
	  }
	  
		return vo_People;
	}

	/* ID 를 생성하는 메서드 */
	@Override
	public int doCreate(Vo_People vo_People) {
		
		int intI = dao_People.doCreate(vo_People);
		
		return intI;
	}

	/* ID 를 수정하는 메서드 */
	@Override
	public int doUpdate(Vo_People vo_People) {
		
		int intI = dao_People.doUpdate(vo_People);
		
		return intI;
	}

	/* ID 를 삭제하는 메서드 */
	@Override
	public int doDelete(String id) {

		int intI = dao_People.doDelete(id);
		
		return intI;
	}

}
