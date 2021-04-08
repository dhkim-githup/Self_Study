
import java.util.*;
import java.text.*;


public class okMro {


	/**
	 * @param args
	 */
	public okMro() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		okMro iTest = new okMro();

		/*
		String aa = "0000000000";
		int bb = aa.length();
		System.out.println(bb);
		String strWhat = iTest.pWhat();
		System.out.println(strWhat);
		*/
		// -- long type 에 L 붙이기
		//long la = 25069809000L;
		//long lb = 25069809000L;
		//long lc=la+lb;
		//System.out.println(lc);
		/*
		String strC="aaaabb ttt '김동현'  ";
		System.out.println("1- "+strC);
		strC = convertString(strC);
		System.out.println("2- "+strC);
		*/
		Vector<String> vSplit=new Vector<String>();

		/**
		 * 해쉬테이블 테스트
		 */
		Vector vHash=new Vector();
		Hashtable hashtable = new Hashtable();

		hashtable.put("jakarta1", "project1");
		hashtable.put("jakarta2", "project2");
		hashtable.put("jakarta3", "project3");
		vHash.add(0,hashtable);
		System.out.println(hashtable.size());

		Hashtable hashtable2 = new Hashtable();
		hashtable2.put("jakarta1", "project4");
		hashtable2.put("jakarta2", "project5");
		hashtable2.put("jakarta3", "project6");
		vHash.add(1,hashtable2);

		System.out.println(hashtable2.size());
		/*
		hashtable.put("jakarta1", "project2");
		vHash.add(hashtable);
		hashtable.put("jakarta2", "project3");
		vHash.add(hashtable);
		*/



		System.out.println(vHash.size());
		Hashtable ht = new Hashtable();
		int count=0;
		for(int i=0; i<vHash.size(); i++) {
			ht = (Hashtable)vHash.elementAt(i);
			Hashtable cloneObject = (java.util.Hashtable)ht.clone();
			Enumeration eh = cloneObject.keys();
			String key="" , key2="";
			while(eh.hasMoreElements()) {
			   count++;
			   key = (String)eh.nextElement();
			   System.out.println(i +">"+count+" >> key >> "+key + " : value >> " +ht.get(key));
			}

		}






		/*
		String strQry="";
		vSplit=iTest.getSplitStr(" 안전화  흑색", " ");
		int iSplit=vSplit.size();
		System.out.println(iSplit);
		for (int i=0; i<iSplit; i++){
			if(i==0){
			 strQry+=" Spec like '%"+ (String)vSplit.elementAt(i)+"%'";
			}else{
			strQry+=" and Spec like '%"+ (String)vSplit.elementAt(i)+"%'";
			}
			System.out.println(i+"=>"+(String)vSplit.elementAt(i));
		}
		System.out.println("strQry=>("+strQry+")");
		*/
	}

	private String pWhat() {
		return "WHAT";
	}

//	실제 문자열을 치환하는 함수
	public static String replace(String str, String pattern, String replace) {
	int spos = 0;
	    int epos = 0;

	    StringBuffer result = new StringBuffer();

	    while ((epos = str.indexOf(pattern, spos)) >= 0) {
	        result.append(str.substring(spos, epos));
	        result.append(replace);
	        spos = epos+pattern.length();
	    }
	    result.append(str.substring(spos));
	    return result.toString();
	}

//	치환해야 할 항목들을 한곳으로 모아서 처리
	public static String convertString(String str) {
	String strTemp;

	strTemp = replace (str, "\'", "\\'");
	strTemp = replace (strTemp, "&", "&amp;");
	strTemp = replace (strTemp, "\"", "&quot;");
	strTemp = replace (strTemp, "<", "&lt;");
	strTemp = replace (strTemp, ">", "&gt;");

	return strTemp.trim();
	}


	/**
	 * dhkim 문자열을 구분하여 리턴하는 함수
	 * @param value 첫번째 파라메터로 스트링값
	 * @param divis 두번째바라페터로 스트링값 구분자
	 * @return 벡터값 리턴
	 */
    public static Vector<String> getSplitStr(String value, String divis) {
        int fromIndex = 0;
        int toIndex   = 0;

        // 벡터선언
        Vector<String> vSplit=new Vector<String>();
        // 앞 뒤 공백제거
        value=value.trim();
        // 전체사이즈계산
        int iValue=value.length();

        // divis 문자가 있을때까지 순환
        while (value.indexOf(divis)>=0) {
        	// 처음 공백문자의 위치를 toIndex에 표시
            toIndex  = value.indexOf(divis);
            // 첫번째 문자열 저장 ( 벡터에 저장 )
            vSplit.addElement(value.substring(fromIndex, toIndex));
            // 추출된 문자열을 제외한 문자열 저장
            value=value.substring(toIndex, iValue);
            // 앞 뒤 공백제거
            value=value.trim();
            // 전체사이즈 재 계산
            iValue=value.length();
        }
        // 마지막 문자열을 벡터에 저장
        value=value.trim();
        vSplit.addElement(value);
        // 최종 리턴값 (벡터)
        return vSplit;
    }

    /*
     * 2007.12.10 작업생성
 	*
 	*/
     public static String[] getSplitStr(String value, char divis) {
         int fromIndex = 0;
         int toIndex   = 0;
         int arrIndex  = 0;

         int arrCnt    = 0;
         int i         = 0;

         char[] arrChr = value.toCharArray();

         try {
             for (i=0, arrCnt=0 ; i<arrChr.length ; i++) {
                 if (arrChr[i]==divis) arrCnt++;
             }
         }
         catch (Exception e)
         {
 			 System.out.println("ERRMSG : " + e.toString());
         }

         String[] arrStr = new String[arrCnt+1];

         for (arrIndex=0 ; (toIndex=value.indexOf(divis, fromIndex))>=0 ; arrIndex++) {
             toIndex          = value.indexOf(divis, fromIndex);
             arrStr[arrIndex] = value.substring(fromIndex, toIndex);
             fromIndex        = toIndex + 1;
         }

         arrStr[arrIndex] = value.substring(fromIndex);
         return arrStr;
     }







}
