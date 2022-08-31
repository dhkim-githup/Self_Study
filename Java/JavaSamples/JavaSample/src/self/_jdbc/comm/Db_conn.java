package self._jdbc.comm;

/**
 * Db 연결을 공통으로 하도록 처리함.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_conn {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
    private String user_id="scott";        
    private String user_pw="tiger";
    
    private Connection conn = null; // DB 에 connection 된 객체를 저장 
    private Statement stmt = null;  // connection 객체에 실행문을 던지는 역할(창구)
    
    
	public Connection getConn()  {
		
		try {	
			/* Driver Loading */
	        Class.forName(driver);
			/* Oracle Connection 
			 * 여기까지만, 실행해보고, 실제 오라클 접속이 되었는지 체크 
			 * */
	        conn = DriverManager.getConnection(dbURL, user_id, user_pw);
	        System.out.println("Connection Success");
			
	        /* jdbc 는 기본적으로 자동커밋을 한다. 자동커밋 해제 */
	        // conn.setAutoCommit(false);  // 자동 커밋 해제
	    
	        
		} catch (Exception e) {
			conn = null;
		}   
			
	     return conn;
		
	}
	
	public Statement getStmt( ) {
		 try {	
			stmt = conn.createStatement(); 
		 }catch(Exception e) {
			stmt = null;
		 }
		 
		return stmt;
		
	}
	
	
    
    

}
