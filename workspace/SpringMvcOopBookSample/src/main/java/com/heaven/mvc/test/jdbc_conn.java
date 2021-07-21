package com.heaven.mvc.test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jdbc_conn {
	
	@RequestMapping("/jdbc")
	public String doHi() {
		
		Connection metsConn = null;
		String dbURL="jdbc:oracle:thin:@localhost:1521/xe";
        String user_id="scott";        
        String user_pw="tiger";

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			metsConn = DriverManager.getConnection(dbURL, user_id, user_pw);
			metsConn.setAutoCommit(false);
			
			System.out.println("Oracle 19C Test , Success Connection ");
			
		}catch(Exception e) {
			System.out.println("Oracle 19C Test , Fail Connection "+e);
		}finally {

		}
		
		return "Hello";
		
	}

}
