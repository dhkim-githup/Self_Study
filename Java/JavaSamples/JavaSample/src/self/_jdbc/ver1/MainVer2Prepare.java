package self._jdbc.ver1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * dhkim 
 * JDBC 초기 단계로  하나의 파일에서  모든 처리를 진행한다. 
 * 마치 Web Jsp 파일 하나로 모든걸 처리하는 수준과 유사하다.
 * Ojdbc 라이브러리는 필수로 환경값에 추가 , ex)ojdbc6 
 * PreparedStatement Ver
 * @author PC
 *
 */

public class MainVer2Prepare {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
        String user_id="scott";        
        String user_pw="tiger";
        String qry="";
        int result =0;
        
        
        Connection conn = null; // DB 에 connection 된 객체를 저장 
        PreparedStatement ps = null;  // connection 객체에 실행문을 던지는 역할(창구)
        ResultSet rs = null;     // select 결과값을 받아옮
               
     try {
    	 
    
		/* Driver Loading */
        Class.forName(driver);
		/* Oracle Connection 
		 * 여기까지만, 실행해보고, 실제 오라클 접속이 되었는지 체크 
		 * */
        conn = DriverManager.getConnection(dbURL, user_id, user_pw);
        /* jdbc 는 기본적으로 자동커밋을 한다. 자동커밋 해제 */
        // conn.setAutoCommit(false);  // 자동 커밋 해제
        
        System.out.println("Connection Success");
		
        /* Statement - select, insert, update, delete */
		
        /* Insert */
        qry = " insert into customer (name, age, gender, reg_dati) "
   			 +"	values( ? , ? , ? ,sysdate) ";
        
         ps = conn.prepareStatement(qry);
         ps.setString(1, "홍길자");
         ps.setInt(2, 30);
         ps.setString(3, "M");         
         
        result = ps.executeUpdate();
		if(result == 1) {
			System.out.println("Insert Success");
		}else {
			System.out.println("Insert Fail");
		}
		
		ps.close();
		
		/* Result Set , Print */	
		qry = "select name, age, gender, to_char(reg_dati,'yyyy.mm.dd') as reg_dati from customer";
		
		ps = conn.prepareStatement(qry);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.printf("Name : %s, Age : %d, Gender : %s, Date : %s \n", rs.getString("name"), rs.getInt("age"), rs.getString("gender"), rs.getString("reg_dati"));
		}
		
		ps.close();
		rs.close();
		
		/* Update */
		qry = " update  customer "
			 +" set "
			 +" name= ?, age= ? "
			 +" where name='홍길순'"
			 ;
	     
		ps = conn.prepareStatement(qry);
		ps.setString(1, "홍길돈");
		ps.setInt(2, 30);
		result = ps.executeUpdate();
			if(result == 1) {
				System.out.println("Update Success");
			}else {
				System.out.println("Update Fail");
			}	
		
		ps.close();
		
		/* Result Set , Print */	
		rs = null;
		qry = "select name, age, gender, to_char(reg_dati,'yyyy.mm.dd') as reg_dati from customer";
		
		ps = conn.prepareStatement(qry);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.printf("Name : %s, Age : %d, Gender : %s, Date : %s \n", rs.getString("name"), rs.getInt("age"), rs.getString("gender"), rs.getString("reg_dati"));
		}	
		
		/* Delete */
		/*
		qry = " delete from  customer where name='홍길순' " ;
		result = stmt.executeUpdate(qry);
		
		if(result == 1) {
			System.out.println("Delete Success");
		}else {
			System.out.println("Delete Fail");
		}	
		*/	
		// conn.commit(); 자동커밋 사용 
		
     }catch (Exception e) {
		System.out.println("Error =>"+e);
		conn.rollback();
	 }finally {
		 /* Close */ 
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();			
		}catch (Exception e2) {			
		}
	}	

	}

}
