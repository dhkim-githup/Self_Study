import java.util.*;
public class token {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_sou_num="1:2:3";
		StringTokenizer nut = new StringTokenizer(str_sou_num,":");
		System.out.println("Token.length=>"+nut);		
		
		while (nut.hasMoreTokens())  // While No.1
	    {  // 토큰링의 순환문 시작
				System.out.println("count");
	    		System.out.println(nut.nextToken());
	    }
		
		// split 사용		 
		String[] arr = str_sou_num.split("\\:");
		System.out.println("arr.length=>"+arr.length);
		System.out.print("분리후 문자열 : ");
		for (String string : arr) {
		    System.out.println(string + "|");
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println("result:"+arr[i]);
		}
	}

}
