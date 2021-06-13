package self._jdbc.ver2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import self._jdbc.comm.Db_conn;


/**
 * Dao
 * Ver2. DB 연결 및 데이타 처리 부분 분리 작업 
 * @author PC
 *
 */

public class Ver2_Dao {
	
	/* Db connection Class 객체 생성 */
	Db_conn db_conn = new Db_conn();	
	
	
    private String qry="";
    private int result =0;        
    
    private Connection conn = null; // DB 에 connection 된 객체를 저장 
    private Statement stmt = null;  // connection 객체에 실행문을 던지는 역할(창구)
    private ResultSet rs = null;     // select 결과값을 받아옮
    
    
    /*
     * Select 의 값을 list , hashmap 을 통해 저장하여 리턴  
     */
    public List<HashMap<String, String>> doSelect(String name) {
    	
    	List<HashMap<String , String>> list = new ArrayList<>(); 
    	
        conn = db_conn.getConn();
        stmt = db_conn.getStmt();
    	
    	
    	try {    		
	    	/* Result Set , Print */	
			qry = "select name, age, gender, to_char(reg_dati,'yyyy.mm.dd') as reg_dati "
				 +" from customer "
				 +" where name='"+name+"'"
				 ;
			
			System.out.println(qry);
			rs = stmt.executeQuery(qry);
		
			/** 
			 * Select 값을 hashmap 에 넣고, 해당 값을 list 에 추가 
			 */
			while(rs.next()) {
				HashMap<String, String> map = new HashMap<>();
				//System.out.printf("Name : %s, Age : %d, Gender : %s, Date : %s \n", rs.getString("name"), rs.getInt("age"), rs.getString("gender"), rs.getString("reg_dati"));
				map.put("name", rs.getString("name"));
				map.put("age",  Integer.toString(rs.getInt("age")));
				map.put("gender", rs.getString("gender"));
				map.put("reg_dati", rs.getString("reg_dati"));
				
				list.add(map);
			}	
			
		
			
		doClose();
			
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	return list;
    	
    }

    
    public void doInsert(String name, int age, String gender) throws SQLException {
    	
    	conn = db_conn.getConn();
        stmt = db_conn.getStmt();
        
    	try {
		    	/* Insert */
		        qry = " insert into customer (name, age, gender, reg_dati) "
		   			 +"	values('"+name+"',"+age+",'"+gender+"',sysdate) ";
		        result = stmt.executeUpdate(qry);
				if(result > 1) {
					System.out.println("Insert Success");
				}else {
					System.out.println("Insert Fail");
				}		
    	} catch (Exception e) {
    		conn.rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	doClose();
    }
    
    public void doUpdate(String bname, String aname, int age, String gender) throws SQLException {
    	
    	conn = db_conn.getConn();
        stmt = db_conn.getStmt();
    	/* Update */
    	try {
		qry = " update  customer "
			 +" set "
			 +" name='"+aname+"', age="+age+", gender='"+gender+"', reg_dati=sysdate "
			 +" where name='"+bname+"'"
			 ;
	        result = stmt.executeUpdate(qry);
			if(result > 0) {
				System.out.println("Update Success");
			}else {
				System.out.println("Update Fail");
			}	
    	} catch (Exception e) {
    		conn.rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	
    	doClose();
    }
    
    public void doDelete(String name) throws SQLException {
    	
    	conn = db_conn.getConn();
        stmt = db_conn.getStmt();
        
    	try {   		    		
    		qry = " delete from  customer where name='"+name+"' " ;
    		result = stmt.executeUpdate(qry);
    		
    		if(result > 0) {
    			System.out.println("Delete Success");
    		}else {
    			System.out.println("Delete Fail");
    		}	
    	} catch (Exception e) {
    		conn.rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	
    	doClose();
    	    	
    }
    
    
    public void doClose() {
    	 /* Close */ 
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();			
		}catch (Exception e2) {			
		}
    }
    



}
