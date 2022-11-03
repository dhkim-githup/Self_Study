package com.example.coffeedev.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMariaDbConn {

    public void doConn() {
        String driver = "org.mariadb.jdbc.Driver";
        String dbURL = "jdbc:mariadb://localhost:3307/boot_study";
        String user_id = "boot";
        String user_pw = "boot";
        String qry = "";
        int result = 0;


        Connection conn = null; // DB 에 connection 된 객체를 저장
        PreparedStatement ps = null;  // connection 객체에 실행문을 던지는 역할(창구)
        ResultSet rs = null;     // select 결과값을 받아옮

        try{
            /* Driver Loading */
            Class.forName(driver);
            /* Oracle Connection
             * 여기까지만, 실행해보고, 실제 오라클 접속이 되었는지 체크
             * */
            conn = DriverManager.getConnection(dbURL, user_id, user_pw);
            /* jdbc 는 기본적으로 자동커밋을 한다. 자동커밋 해제 */
            conn.setAutoCommit(false);  // 자동 커밋 해제

            System.out.println("Connection Success");

            System.out.println("===============================================");
            /* Result Set , Print */
            System.out.println("select * from coffee");
            qry = "select * from coffee";

            ps = conn.prepareStatement(qry);
            rs = ps.executeQuery();

            while(rs.next()) {
                System.out.printf("Name : %s, kind : %s, price : %s \n", rs.getString("name"), rs.getString("kind"), rs.getString("price"));
            }

            /* Result Set , Print */
            System.out.println("===============================================");
            System.out.println("select * from coffee_log");
            qry = "select * from coffee_log";

            ps = conn.prepareStatement(qry);
            rs = ps.executeQuery();

            while(rs.next()) {
                System.out.printf("Coffee_ID : %s, price : %s \n", rs.getString("Coffee_ID"), rs.getString("price"));
            }

        }catch (Exception e){
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
