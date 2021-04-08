package javaFtp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPListParseEngine;
import org.apache.commons.net.ftp.FTPReply;


public class FtpDownloadFile {
	
	// 연결 서버 정보 
	// test용
	private static final String sServer ="172.16.1.204";
	private static final int iPort =21;
	private static final String sId ="mro";
	private static final String sPassword ="mp240";
	
	private static final String sUpDir ="C://";
	private static final String sDownDir ="C://";
	private static final String sLogDir ="C://";
	
	
	/*
	private static final String sServer ="211.54.5.135";
	private static final int iPort =21;
	private static final String sId ="rocket";
	private static final String sPassword ="rocket01";
	
	private static final String sUpDir ="/user/home/mro/src/upload";
	private static final String sDownDir ="/user/home/mro/src/upload";
	private static final String sLogDir ="/user/home/mro/src/upload";
	*/
	
	FTPClient ftpClient;
	
	public FtpDownloadFile(){
		ftpClient = new FTPClient();
	}
	
	// 연결
	protected void connect(){
		
		try{
			ftpClient.connect(sServer,iPort);
			int reply;
			//연결 시도후 , 성공했는지 응답 코드 확인
			reply = ftpClient.getReplyCode();
			
			if(!FTPReply.isPositiveCompletion(reply)){
				ftpClient.disconnect();
				System.out.println("FTP 서버 연결 거부");
			}else{
				System.out.println("FTP 서버 연결");
			}
		}catch(IOException ioe){
			if(ftpClient.isConnected()){
				try{
					ftpClient.disconnect();
				}catch(IOException f){
				}
			
			}
			System.out.println("FTP 서버 연결 실패");
		}	
	
	} // connect End
	
	//로그인
	protected boolean login(){
		
		try{
			System.out.println("FTP 서버 로그인");			
			return ftpClient.login(sId,sPassword);
		}catch(IOException ioe){
			System.out.println("FTP 서버 로그인 실패");
		}
		return false;
	} // login End
	
	//로그아웃
	protected boolean logout(){
		
		try{
			this.connect();
			System.out.println("FTP 서버 로그아웃");
			return ftpClient.logout();
		}catch(IOException ioe){
			System.out.println("FTP 서버 로그아웃 실패");
		}
		return false;
	} // login End
	
	
	protected FTPFile[] list(){
		
		FTPFile[] files = null;
		
		try{
			files = this.ftpClient.listFiles();
			System.out.println("파일리스트 가져오기 ");
			return files;
		}catch(IOException ioe){
			System.out.println("파일리스트 가져오기 실패");
		}
		return null;
	} // login End
	
	protected FTPFile[] showlist(){
		
		System.out.println("==========1============");		
		
		try{
			
			/*
			ftpClient.changeWorkingDirectory("/user/home/mro/src/test");
			ftpClient.printWorkingDirectory();
			System.out.println(" ftpfiles.length >> "+ftpClient.printWorkingDirectory());
			System.out.println(" ftpfiles.ListNames >> "+ftpClient.listNames());
			
			FTPFile[] ftpfiles = ftpClient.listFiles();
			
			//FTPFile[] ftpfiles = ftpClient.listFiles();
			System.out.println(" ftpfiles.length >> "+ftpfiles.length);
				          
			*/
			ftpClient.changeWorkingDirectory("/user/home/mro/src/test");
			FTPFile[] ftpfiles = ftpClient.listFiles();
			//System.out.println(ftpfiles.length);
			/*
			FTPFile[] files = ftpClient.listFiles("/user/home/mro/src/test");
	        System.out.println(files.length);
	        for (FTPFile file : files) {
	            System.out.println(file.getName());
	        }
			*/
	        String[] fileNames = ftpClient.listNames();
	        if (fileNames != null) {
	            for (String file : fileNames) {
	                System.out.println(file);
	            }
	        }
			
			
			System.out.println("==========2============"+ ftpfiles);	
			if (ftpfiles != null) {
				System.out.println("==========3============"+ftpfiles.length);
				for (int i = 0; i < ftpfiles.length; i++) {
					System.out.println("==========4============");
				FTPFile file = ftpfiles[i];
				System.out.println(file.toString()); // file.getName(), file.getSize() 등등..
				}
			}				
			
			System.out.println("==========8============");
		}catch(IOException ioe){
			System.out.println("파일리스트 보여주기 실패");
		}
		
		
		return null;
	} // login End
	
	protected boolean get(String source, String target, String name){
		
		boolean flag = false;
		OutputStream output = null;
		
		try{			
			File local = new File(sDownDir, name);			
			output = new FileOutputStream(local);
			System.out.println("다운로드할 디렉토리 확인 ");
			
		}catch(IOException ioe){
			System.out.println("다운로드할 디렉토리 확인  실패");
			return flag;
		}		
		
		File file = new File(source);
		
		System.out.println(source);
		
		try{
			if(ftpClient.retrieveFile(source, output)){
				flag = true;
			}
			System.out.println("파일 다운로드 완료 ");
		}catch(IOException ioe){
			System.out.println("파일 다운로드 실패 ");			
		}
		return flag;
	} // login End
	
	protected File getFile(String source, String name){
		
		OutputStream output = null;
		File local = null;
		
		
		try{
			local = new File(sDownDir, name);
			output = new FileOutputStream(local);		
		}catch(FileNotFoundException fnfe){
			System.out.println("다운로드할 디렉토리가 없습니다.");
		}
		
		File file = new File(source);
		
		try{
			if(ftpClient.retrieveFile(source, output)){
				//
			}			
		}catch(IOException ioe){
			System.out.println("파일을 다운로드 하지 못했습니다. ");
			
		}
		return local;
	} // login End
	
	protected boolean put(String fileName, String targetName){
		
		boolean flag = false;
		InputStream  input = null;
		File local = null;
		
		
		try{
			local = new File(sUpDir, fileName);
			input = new FileInputStream(local);		
		}catch(FileNotFoundException e){
			return flag;
		}
		
		
		try{
			if(ftpClient.storeFile(targetName, input)){
				flag = true;
			}			
		}catch(IOException ioe){
			System.out.println("파일을 전송하지 못했습니다.");
			return flag;
		}
		return flag;
	} // login End
	
	
	protected void cd(String path){
		
		try{
			ftpClient.changeWorkingDirectory(path);
		}catch(IOException ioe){
			System.out.println("폴더를 이동하지 못했습니다.");
		}
	} // login End
	
	protected void disconnect(){
		
		try{
			ftpClient.disconnect();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	} // login End
	
	protected void setFileType(int iFileType){
		
		try{
			ftpClient.setFileType(iFileType);
		}catch(IOException ioe){
			System.out.println("파일 타입을 설정하지 못했습니다.");
		}
	} // login End	


} // 전체 End
	
	