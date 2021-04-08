
/**
 * DB 연결 테스트
 */

import java.sql.*;
import java.sql.SQLException;

public class db_conn {
 public static void main(String[] args) {
   Connection conn= null;
   PreparedStatement ps =null;
   ResultSet rs =null;
   String infile=null;
   String strRet=null;
   int intRet = 0;

   // 1. jdbc driver 를 등록한다.
   try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
   } catch (ClassNotFoundException e ) {
    System.out.println("Error 1 =>"+e);
   }

   // 2. DB와 연결한다.
   try{

    conn = DriverManager.getConnection(
           "jdbc:oracle:thin:@192.168.1.211:1521:TESTDB","METS_IMSI","METS_IMSI");
   } catch (SQLException e) {
    System.out.println("Error 2 =>"+e);
   }


   // 4.test 테이블 생성
   try {
     infile= "select *  from cust_dtl where enpri_cd='000001' ";
     ps = conn.prepareStatement(infile);
     rs = ps.executeQuery();
     // ResultSet에 저장된 자료를 한 레코드 읽어온다.
         while(rs.next())
         {
         strRet = rs.getString("cust_nm");
         System.out.println("name = " + strRet);
         }

     //}
    System.out.println("셀렉트 완성");

    // 5.db을 닫는다.
    ps.close();
    rs.close();
    conn.close();


   } catch (SQLException e) {
     System.out.println("Eror"+e.getMessage());
   }catch(Exception e){}
 }

}


