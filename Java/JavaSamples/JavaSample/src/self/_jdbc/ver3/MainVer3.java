package self._jdbc.ver3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import self._jdbc.ver2.Ver2_Dao;

/**
 * 1.단계 : DB 연결 부분을 별도로 만들어 공용으로 사용하도록 한다.
 * 마치 Web Jsp 파일 하나로 모든걸 처리하는 수준과 유사하다.
 * Ojdbc 라이브러리는 필수로 환경값에 추가 , ex)ojdbc6 
 * @author PC
 *
 */

public class MainVer3 {

	public static void main(String[] args) {
				
		Ver3_Service ver3_service = new Ver3_Service();
		
		String name="";
		           
     try {
    	 
    	 /* Select 구문 처리 */
    	 List<Ver3_Dto_Customer> list = new ArrayList<>(); 
    	 
    	 name = "홍길동";
    	 list = ver3_service.doService(name);
    	 
    	 for(Ver3_Dto_Customer vdc : list) {
    		 System.out.printf(" name : %s , ", vdc.getName());
    		 System.out.printf(" age : %s  , ", vdc.getAge());
    		 System.out.printf(" gender : %s , ", vdc.getGender());
    		 System.out.printf(" reg_dati : %s \n", vdc.getReg_dati());    		 
    	 }    	 
    	     	 		
     }catch (Exception e) {
		System.out.println("Error =>"+e);		
	 }finally {		
	}	

	}

}
