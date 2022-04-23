package com.example.sample.model2.mybatis.service;

import com.example.sample.model2.vo.Vo_People;

import java.util.List;


public interface Sv_mbt_IfPeople {
	
	// 전체 리스트 가져오기 
	public List<Vo_People> doReadList();
	
	// 특정 Id 리스트만 가져오기 
	public Vo_People doReadId(String id);
	
	// 데이타 로우 생성하기
	public int doCreate(String id, String name, String age);
	
	// 특정 ID 정보 수정하기 
	public int doUpdate(Vo_People vo_People);
	
	// 특정 ID 정보 삭제하기 
	public int doDelete(String id);	

}
