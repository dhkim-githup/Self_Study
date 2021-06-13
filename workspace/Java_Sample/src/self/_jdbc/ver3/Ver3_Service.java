package self._jdbc.ver3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Service 영역
 * Ver3. 요청 서비스 부분 분리 작업 
 * 
 */

public class Ver3_Service {

	Ver3_Dao ver3_Dao = new Ver3_Dao();
	
	public List<Ver3_Dto_Customer> doService(String name) {
	
		 /* Select 구문 처리 */
   	     List<Ver3_Dto_Customer> list = new ArrayList<>(); 
		 list = ver3_Dao.doSelect(name);
 		
    	return list;
	}

}
