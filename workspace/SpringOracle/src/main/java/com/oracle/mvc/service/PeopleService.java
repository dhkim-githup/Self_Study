package com.oracle.mvc.service;

import java.util.List;
import com.oracle.mvc.vo.People;

public interface PeopleService {
	
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
