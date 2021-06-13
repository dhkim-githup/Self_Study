package self._jdbc.ver2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 1.단계 : DB 연결 부분을 별도로 만들어 공용으로 사용하도록 한다.
 * 마치 Web Jsp 파일 하나로 모든걸 처리하는 수준과 유사하다.
 * Ojdbc 라이브러리는 필수로 환경값에 추가 , ex)ojdbc6 
 * @author PC
 *
 */

public class MainVer2 {

	public static void main(String[] args) {
		
		Ver2_Dao ver2_Dao = new Ver2_Dao();
		           
     try {
    	 
    	 /* Select 구문 처리 */
    	 List<HashMap<String , String>> list = new ArrayList<>(); 
    	 
    	 list = ver2_Dao.doSelect("홍길동");
    		
    	 for(HashMap<String, String> lt : list) {
    		 System.out.printf(" name : %s , ", lt.get("name"));
    		 System.out.printf(" age : %s  , ", lt.get("age"));
    		 System.out.printf(" gender : %s , ", lt.get("gender"));
    		 System.out.printf(" reg_dati : %s \n", lt.get("reg_dati"));    		 
    	 }
    	 
    	 
    	 /* Insert */
    	 ver2_Dao.doInsert("홍길순", 30, "F");
    	 
    	 /* Update */
    	 ver2_Dao.doUpdate("홍길동", "홍길동", 20, "M");
		
     }catch (Exception e) {
		System.out.println("Error =>"+e);		
	 }finally {		
	}	

	}

}
