
import java.util.ArrayList;
import java.util.*;

public class arraylist {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		
		  al.add("박");
		// 그중 3번째에 있는 값을 이로 변경한다.
		  al.add("이");
		// 그중 5번째에 있는 값을 정로 변경한다.
		  al.add("정");
		// 콘솔에 찍는 값은 {,"박",,"이",,"정",};
		  System.out.println("indexOf : "+al.indexOf("이"));


		//이런식으로 찍힐겁니다. 직접 찍어보시면.. 나올듯 하구여..
		  for(int i=0; i<al.size(); i++){
		    System.out.println("변환된 값 : "+al.get(i));
		  }
		  
		  List list1 = new ArrayList();
	}
}