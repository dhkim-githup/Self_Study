package com.example.bootv2.comm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Con_encryptTest {

    @Test
    public void doTest() throws Exception {
        Con_encrypt conEncrypt = new Con_encrypt();

        String strName="03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4";
        String strName2="홍길동이너네아버지이냐 우리 아버지이냐 그것이 궁금하다";
        String strKey16="AB123ab456CDcd@#";
        String strEnc16="Utx45XL8ETGHrl6nOMK2ZQ==";
        String strKey32="AB123ab456CDcd@#AB123ab456CDcd@#";
        String strEnc32="V4V5t6BAX3oLw0RNbgb+Rw==";
        String strEnc32a="khScc4bk7YFzbO4RETPl0l7jAAbgKOO87P9//lc0oq7d5AM6BsdCTMawl+9Dn5Fy8Tl/meHkd1sOMbdtWod7/W7cTMR6yB/NxKbvS3D1YnE=";

        String strNameEncrypt="";

        /* 단반향암호화 */
        strNameEncrypt = conEncrypt.encryptSHA256(strName);
        System.out.println("strNameEncrypt : "+strNameEncrypt);

        //assertEquals("03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4",strNameEncrypt);

        /* 양방향 암호화 */
        strNameEncrypt = conEncrypt.encryptSha256(strName);
        System.out.println("strNameEncrypt : "+strNameEncrypt);

        strNameEncrypt = conEncrypt.encryptAes(strName,strKey16);
        System.out.println("strNameEncrypt 16: "+strNameEncrypt);

        strNameEncrypt = conEncrypt.decryptAes(strEnc16,strKey16);
        System.out.println("strNameEncrypt 16: "+strNameEncrypt);

        strNameEncrypt = conEncrypt.encryptAes(strName,strKey32);
        System.out.println("strNameEncrypt 32: "+strNameEncrypt);

        strNameEncrypt = conEncrypt.decryptAes(strEnc32,strKey32);
        System.out.println("strNameEncrypt 32: "+strNameEncrypt);

        strNameEncrypt = conEncrypt.encryptAes(strName2,strKey32);
        System.out.println("strNameEncrypt 32: "+strNameEncrypt);
        strNameEncrypt = conEncrypt.decryptAes(strEnc32a,strKey32);
        System.out.println("strNameEncrypt 32: "+strNameEncrypt);



    }

}