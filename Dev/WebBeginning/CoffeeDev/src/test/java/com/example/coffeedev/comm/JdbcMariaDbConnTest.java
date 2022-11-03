package com.example.coffeedev.comm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JdbcMariaDbConnTest {
    /* MariaDB 세션 확인 : SHOW PROCESSLIST;  */
    @Test
    void doConn() {
        JdbcMariaDbConn jdbcMariaDbConn = new JdbcMariaDbConn();
        jdbcMariaDbConn.doConn();
    }
}