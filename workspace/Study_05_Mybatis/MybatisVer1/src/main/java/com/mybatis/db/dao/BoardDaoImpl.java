package com.mybatis.db.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mapper.list", map);
		
	}
	
	

}
