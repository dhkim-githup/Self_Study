package javaFtp;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.text.*;

import org.apache.commons.net.ftp.FTPReply;

public class sebang_Demon {
	
	public static void main(String[] args) throws IOException{
		
		try{
				// 추후 파일명 형식을 가져올때 날짜로 해서 만들 예정입니다. 
				String strTodayDate = "";
				Calendar calInfo = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyymmdd");
				strTodayDate = formatter.format(calInfo.getTime());
				
				// 연결정보 및 가지고 오기 
				FtpDownloadFile fdf = new FtpDownloadFile();
				fdf.connect();
				fdf.login();
				//리스트로가져오기 
				 fdf.list();
				fdf.showlist();
				// 파일로 가져오기 
				 fdf.get("/user/home/mro/src/test/AAA111.txt", "", "201555.txt");
				fdf.logout();	
					
				//일단 파일 읽기	
				/*
				try{
					
					FileReader in = new FileReader("C://201555.txt");
					int c;
					String s = new String();
					while((c= in.read()) != -1 ){
						s = s + (char)c;
					}
					System.out.println("텍스트에 들어있는 문자 내용===============>" + s);	
					
				// 이제 짤라 볼까요? 	//콜롬및 짜르기 정리 	
				StringTokenizer st = new StringTokenizer(s,",");
				
				ArrayList<String> list = new ArrayList<String>();
				
				while(st.hasMoreTokens()){
					list.add(st.nextToken());
				}
				
				for(int i = 0; i < list.size(); i++){
					System.out.println(i+1+"번======>"+list.get(i));	
				}
					in.close();
				}catch(IOException ie){
					System.out.println("파일이 존재하지 않습니다.");
				}catch(Exception e){
					System.out.println(e);
				}						
					*/	
		
		}catch(Exception e){
			
			System.out.println("파일 다운로드 실패 " + e);
			return ;
		}	
		
			
		
		
	}// 메인 종료
	
} // 전체 끝