
import java.sql.*;
import java.sql.SQLException;

public class dbConn {
 public static void main(String[] args) {
   Connection conn= null;
   String name = null;
   String infile=null;
   // 1. jdbc driver 를 등록한다.
   try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
    //conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.3.24:1521:TESTDB","METS18940G","METS18940G070%");
	
	/* 크라운제과 */
    conn = DriverManager.getConnection("jdbc:oracle:thin:@123.140.106.166:1521:SALE","IMD000","IMD000");
    
    infile= "select to_char(sysdate,'yyyy.mm.dd') as time  from dual";

  Statement stmt = conn.createStatement();
  ResultSet srs = stmt.executeQuery(infile);
  while (srs.next()) {
          name = srs.getString(1);
          System.out.println( "time:"+name);
  }
      System.out.println("셀렉트 완성");
      conn.close();
   } catch (SQLException e) {
     System.out.println("Eror"+e.getMessage());
   }catch(Exception e){}
 }

}
