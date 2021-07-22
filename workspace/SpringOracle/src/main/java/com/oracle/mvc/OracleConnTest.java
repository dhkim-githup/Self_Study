package com.oracle.mvc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OracleConnTest {
	
	@RequestMapping("/Conn")
	public String doConn() {
		
		 Connection conn = null;
		 String dbURL="jdbc:oracle:thin:@172.16.3.24:1521/TESTDB";
	     String user_id="METS18940G";        
	     String user_pw="METS18940G070%";
	     String strResult;

			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(dbURL, user_id, user_pw);
				
				System.out.println("Oracle conn Test , Success Connection ");
				strResult = "Oracle conn Test , Success Connection ";
				
			}catch(Exception e) {
				System.out.println("Oracle conn Test , Fail Connection "+e);
				strResult = "Oracle conn Test , Fail Connection "+e;
			}finally {

			}		
			
			return "Oracle Connecton : "+ strResult;
			
	}
	
	

}
