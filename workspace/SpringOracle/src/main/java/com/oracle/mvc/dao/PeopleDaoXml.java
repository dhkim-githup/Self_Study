package com.oracle.mvc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.oracle.mvc.vo.People;

@Mapper
public interface PeopleDaoXml {
	
		/* CRUD 처리 */
		
		// Insert 
		int doInsert(People people);
		
		// - Select 
		List<People> getPeople();
	
		// - Update  	
		int doUpdate(People people);
		
		// - Delete
		int doDelete(String name);
		

}
