package com.mybatis.db.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mybatis.db.dao.BoardDao;
import com.mybatis.db.dao.BoardDaoImpl;

@Service("service")
public class BoardServiceImpl implements BoardService {

	@Resource(name="dao")
	private BoardDaoImpl boardDaoImpl;
	
	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return boardDaoImpl.list(map);
	}

}
