
import java.util.ArrayList;

public class arrayTest {
	/**
	 * @param args
	 */
	public arrayTest() {
	}

	public static void main(String[] args) {
		String [][][] mainList = new String[7][7][4];

		mainList[0][0][0]="String0";
		mainList[0][0][1]="String0-1";
		mainList[0][0][2]="String0-2";
		mainList[0][0][3]="String0-3";
		mainList[1][0][0]="String2";
		mainList[2][0][0]="String3";
		mainList[3][0][0]="String4";
		mainList[4][0][0]="String5";
		mainList[5][0][0]="String6";
		mainList[6][0][0]="String7";


		System.out.println("System => Last test' or 1=1 -- =>"+ mainList.length );
		System.out.println("System => Last test' or 1=1 -- =>"+ (String)mainList[0][0][1] );


		String s[] = { "Google", "Yahoo", "MSN", "땡칠이" };
		for (int i = 0; i < s.length; i++){
		      System.out.println(s[i].toString());
		}

		// new 연산자로, 10개의 문자열 오브젝트 미리 확보하기
	    String cool[] = new String[10];
	    for (int i = 0; i < cool.length; i++) {
	      cool[i] = "ㅎㅎ"; // 모든 요소들을 "ㅎㅎ" 라는 문자열로 채우고
	      System.out.format("%d = %s%n", i, cool[i]); // 출력하기
	    }
	}

}
