
import java.sql.*;
import java.sql.SQLException;

public class testConn {
 public static void main(String[] args) {
   Connection conn= null;
   String name = null;
   String infile=null;
   // 1. jdbc driver 를 등록한다.
   try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    conn = DriverManager.getConnection(
           "jdbc:oracle:thin:@test.mro.co.kr:1521:ORA8","mets","mets");

   // 4.test 테이블 생성
 infile= "select *  from cust_dtl where enpri_cd='000001' ";

Statement stmt = conn.createStatement();
ResultSet srs = stmt.executeQuery(infile);
while (srs.next()) {
        name = srs.getString("cust_nm");
        System.out.println( "cust_ID:"+name);
}
    System.out.println("셀렉트 완성");
    // 5.db을 닫는다.
    conn.close();

   }catch(Exception e){
	   System.out.println("Eror"+e.getMessage());
   }
 }

}