
import java.util.Vector;

public class vector{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc_code=new Vector<String>();
		Vector<String> vc_codenm=new Vector<String>();

		  //vc.add(0,"박");
		vc_code.addElement("박");
		// 그중 3번째에 있는 값을 이로 변경한다.
		 // vc.add(2,"이");
		vc_code.addElement("이");
		// 그중 5번째에 있는 값을 정로 변경한다.
		 // vc.add(4,"정");
		  vc_code.addElement("정");
		// 콘솔에 찍는 값은 {,"박",,"이",,"정",};

		//이런식으로 찍힐겁니다. 직접 찍어보시면.. 나올듯 하구여..
		  for(int i=0; i<vc_code.size(); i++){
		    System.out.println(i+">>변환된 값1 : "+vc_code.get(i));
		    System.out.println(i+">>변환된 값2 : "+vc_code.elementAt(i));
		  }
	}

}
