
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
    conn = DriverManager.getConnection(
           "jdbc:oracle:thin:@192.168.1.211:1521:TESTDB","METS_IMSI","METS_IMSI");
    infile= "select *  from all_users";

  Statement stmt = conn.createStatement();
  ResultSet srs = stmt.executeQuery(infile);
  while (srs.next()) {
          name = srs.getString(1);
          System.out.println( "cust_ID:"+name);
  }
      System.out.println("셀렉트 완성");
      conn.close();
   } catch (SQLException e) {
     System.out.println("Eror"+e.getMessage());
   }catch(Exception e){}
 }

}
