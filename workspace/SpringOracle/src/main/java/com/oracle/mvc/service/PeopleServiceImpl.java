package com.oracle.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.mvc.dao.PeopleDaoXml;
import com.oracle.mvc.vo.People;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private PeopleDaoXml peopleDaoXml;
	
	@Override
	public int doInsert(People people) {

		return peopleDaoXml.doInsert(people);
	}

	@Override
	public List<People> getPeople() {
		List<People> list = peopleDaoXml.getPeople();
		return list;
	}

	@Override
	public int doUpdate(People people) {
		
		return peopleDaoXml.doUpdate(people);
	}

	@Override
	public int doDelete(String name) {
		
		return peopleDaoXml.doDelete(name);
	}

}
