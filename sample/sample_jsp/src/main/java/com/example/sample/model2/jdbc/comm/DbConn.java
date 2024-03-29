package com.example.sample.model2.jdbc.comm;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {

	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
	String user_id="scott";        
	String user_pw="tiger";
	String qry="";

	private Connection conn = null; // DB 에 connection 된 객체를 저장 
	
	public Connection getConn(){
		
		try{
			/* Driver Loading */
		    Class.forName(driver);
		    conn = DriverManager.getConnection(dbURL, user_id, user_pw);
		    
		    /* jdbc 는 기본적으로 자동커밋을 한다. 자동커밋 해제 */
	        // conn.setAutoCommit(false);  // 자동 커밋 해제
		    
		    System.out.println("OK Connection");
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
	}
	
	
}
