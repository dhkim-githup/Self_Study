package org.example._63_인터페이스다형성;

interface Database{
    public void getConnection();
    public String getDbInfo();
}

class OracleDatabase implements Database{

    boolean conn = false;
    @Override
    public void getConnection() {
        this.conn = true;
    }
    @Override
    public String getDbInfo() {
        String ret = "";
        if(conn) ret = "Oracle 에 접속";
        else     ret = "Oracle 에 접속 안됨";
        return ret;
    }
}


class MsSqlDatabase implements Database{

    boolean conn = false;
    @Override
    public void getConnection() {
        this.conn = true;
    }
    @Override
    public String getDbInfo() {
        String ret = "";
        if(conn) ret = "MS-SQL 에 접속";
        else     ret = "MS-SQL 에 접속 안됨";
        return ret;
    }
}


public class Sample08 {
    public static void main(String[] args) {
        // 오라클 접속
        Database oradb = new OracleDatabase();
        oradb.getConnection();
        System.out.println(oradb.getDbInfo());

        // MS-SQL 에 접속
        Database msdb = new MsSqlDatabase();
        msdb.getConnection();
        System.out.println(msdb.getDbInfo());

    }
}
