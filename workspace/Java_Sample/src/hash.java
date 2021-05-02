
import java.util.*;
import java.text.*;


public class hash {


	/**
	 * @param args
	 */
	public hash() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 해쉬테이블 테스트
		 */

		// 벡터선언
		Vector<Hashtable> vHash=new Vector<Hashtable>();

		// 해쉬테이블 선언
		Hashtable hashtable = new Hashtable();

		// 해쉬테이블에 키와 밸류 입력
		hashtable.put("jakarta1", "project1");
		hashtable.put("jakarta2", "project2");
		hashtable.put("jakarta3", "project3");
		hashtable.put("jakarta1", "project1");
		System.out.println("====>1==>"+ hashtable.size());

		// 해쉬의 값을 출력
		System.out.println(hashtable.get("jakarta1"));

		// 해쉬의 값을 벡터에 입력
		vHash.add(hashtable);

		// 벡터의 사이즈계산
		System.out.println(vHash.size());

		// 해쉬테이블에 키와 밸류 입력
		Hashtable hashtable2 = new Hashtable();
		hashtable2.put("jakarta1", "project4");
		hashtable2.put("jakarta2", "project5");
		hashtable2.put("jakarta3", "project6");
		// 해쉬의 값을 출력
		System.out.println(hashtable2.get("jakarta1"));
		// 해쉬의 값을 벡터에 입력
		vHash.add(1,hashtable2);
		// 벡터의 사이즈계산
		System.out.println(vHash.size());

		// 해쉬테이블 선언
		Hashtable ht = new Hashtable();
		int count=0;

		// 벡터의 사이즈만큼 순환
		for(int i=0; i<vHash.size(); i++) {
			// 벡터에서 해쉬테이블의 값을 해쉬테이블의 오프젝트에 입력
			ht = (Hashtable)vHash.elementAt(i);
			// 해쉬테이블의 키값을 배열 Enumeration 에 입력
			Enumeration eh = ht.keys();
			String key="" , key2="";
			// Enumeration 의 값만큼 순환하며 해당 키값의 밸류를 출력
			while(eh.hasMoreElements()) {
			   count++;
			   key = (String)eh.nextElement();
			   System.out.println(i +">"+count+" >> key >> "+key + " : value >> " +ht.get(key));
			}

		}

		HashMap hm = new HashMap();



		// 해쉬테이블에 키와 밸류 입력
		hm.put("jakarta1", "project1");
		hm.put("jakarta2", "project2");
		hm.put("jakarta3", "project3");

		hm.put("jakarta1", "project11");
		hm.put("jakarta2", "project12");
		hm.put("jakarta3", "project13");

		System.out.println("====>1==>"+ hm.size());


	}

}