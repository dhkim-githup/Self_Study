import java.sql.CallableStatement;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class conn_test {

	public static Connection metsConn = null;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get Connection 
		getMetsConn();
				
		db_Close();
		
	}

	
	

	/* Create Connection */
	private static Connection getMetsConn() {
		// TODO Auto-generated method stub
		
		
        String dbURL="jdbc:oracle:thin:@172.16.1.17:1521:ORA11GCN";
        String user_id="METS_CN";        
        String user_pw="METS131010CN";

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			metsConn = DriverManager.getConnection(dbURL, user_id, user_pw);
			metsConn.setAutoCommit(false);
			
			System.out.println("Oracle 19C Test , Success Connection ");
			
		}catch(Exception e) {
			System.out.println("Oracle 19C Test , Fail Connection "+e);
		}finally {

		}

		return metsConn;
	}
	
	/* Create Connection */
	private static void db_Close() {
		
		try {
		}catch(Exception e) {
			
		}finally{
			try{
				metsConn.close();
				System.out.println("Oracle 19C Test , Connection close()  ");
			}catch(Exception es) {				
			}
			
		}
		
		
		
	}
	
}
