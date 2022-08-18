package com.example.bootv2.comm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Con_encryptTest {

    @Test
    public void doTest(){
        Con_encrypt conEncrypt = new Con_encrypt();

        String strName="1234";
        String strNameEncrypt="";

        strNameEncrypt = conEncrypt.encryptSHA256(strName);
        System.out.println("strNameEncrypt : "+strNameEncrypt);

        assertEquals("03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4",strNameEncrypt);


    }

}