import java.io.*;

public class File_Reader{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileReader reader = null; // 파일 읽는 클래스 
		 FileWriter writer = null; // 파일 쓰는 클래스
		 
		 /* 파일 읽고 쓰기 */
		 try{
			 reader = new FileReader("C:/Users/dhkim/Desktop/body_4_txt_real.txt");
			 writer = new FileWriter("C:/Users/dhkim/Desktop/body_4_writer.txt");
			 while(true){
				 int data = reader.read();
				 if(data==-1){ break; }
				 char ch = (char) data;
				 System.out.print(ch);
				 writer.write(ch);					 	
			 }// End While
		 }catch(Exception e){
			 System.out.println(e);
		 }finally{
			 try{
				 reader.close(); // 파일 닫기
				 writer.close(); // 파일 닫기 
			 }catch (Exception e) {
			 }
		 }
	}
}
