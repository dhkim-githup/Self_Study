package com.example.bootv2.comm;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 단방향 , 양방향 암호화 진행
 * @author IT늦공
 * @see <a href="https://m.mkexdev.net/441">개인정보보호문서 - https://m.mkexdev.net/441</a>
 * @see <a href="https://1-7171771.tistory.com/82">단방향 참고 블로그 https://1-7171771.tistory.com/82</a>
 * @see <a href="https://fknd12.tistory.com/76">단방향/양방향 참고 블로그 https://fknd12.tistory.com/76</a>
 */

public class Con_encrypt {

    /* 양방향 */


    /**
     * 단방향 암호화 SHA-256
     * @param s  암호화할 값 입력
     * @return   string 암호화된 값 리턴
     */
    public String encryptSHA256(String s) {
        return encrypt(s, "SHA-256");
    }


    public String encryptMD5(String s) {
        return encrypt(s, "MD5");
    }

    /**
     * 단방향 암호화
     * @param s 암호화할 문자
     * @param messageDigest 암호화 방식 SHA-256 or MD5
     * @return
     */
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

    /**
     * 단방향 암호화 Sha256
     * @param value
     * @return string 암호화된 값
     */
    public String encryptSha256(String value) {

        MessageDigest md;
        StringBuffer sb = new StringBuffer("");

        try {

            md = MessageDigest.getInstance("SHA-256");
            md.update(value.getBytes());
            byte byteData[] = md.digest();

            for (byte tmpStrByte : byteData) {
                String tmpEncTxt = Integer.toString((tmpStrByte & 0xff) + 0x100, 16).substring(1);

                sb.append(tmpEncTxt);
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sb.toString();
    }

    /**
     * 양방향 암호화 - 대칭키
     * @param str 암호화 문자열
     * @param key 암호화 키 (16,24,32 byte ex : AB123ab456CDcd@#)
     * @return
     * @throws Exception
     */
    public String encryptAes(String str, String key) throws Exception {

        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encPassword = cipher.doFinal(str.getBytes("UTF-8"));
        String result = Base64.getEncoder().encodeToString(encPassword);

        return result;
    }

    public String decryptAes(String str, String key) throws Exception {

        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");

        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decPassword = cipher.doFinal(Base64.getDecoder().decode(str));
        String result = new String(decPassword, "UTF-8");

        return result;
    }

}
