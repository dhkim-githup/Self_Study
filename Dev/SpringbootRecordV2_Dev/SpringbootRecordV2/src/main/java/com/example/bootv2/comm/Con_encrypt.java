package com.example.bootv2.comm;

import java.security.MessageDigest;

public class Con_encrypt {

    /* 양방향 */

    /* 단방향  https://1-7171771.tistory.com/82
    */
    public String encryptSHA256(String s) {
        return encrypt(s, "SHA-256");
    }

    public String encryptMD5(String s) {
        return encrypt(s, "MD5");
    }

    public String encrypt(String s, String messageDigest) {
        try {
            MessageDigest md = MessageDigest.getInstance(messageDigest);
            byte[] passBytes = s.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digested.length; i++) sb.append(Integer.toString((digested[i]&0xff) + 0x100, 16).substring(1));
            return sb.toString();
        } catch (Exception e) {
            return s;
        }
    }
}
