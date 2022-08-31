
public class test {


	/**
	 * @param args
	 */
	public test() {
	}

	public static void main(String[] args) {
		int a=0;

		System.out.println("System a=>"+ (a++) );

		switch( a ){
		case 0:
			System.out.println("System =>0");
		case 1:
			System.out.println("System =>1");
		case 2:
			System.out.println("System =>2");

		}
		String aa="<script>alert(document.cookie)</script>";
		String bb="<iframe src=http://www.naver.com width=300 height=300></iframe>"
		+"Test";
		System.out.println("System =>"+ test.F_AttackXssCsrf(aa));
		System.out.println("System =>"+ test.F_AttackXssCsrf(bb));

		String test="test";
		int aaa= test.length();
		System.out.println("Lenght =>"+ aaa);

		String strUrl ="https://www.happy.co.kr";
		strUrl = strUrl.replace("https://","://");
		System.out.println("strUrl =>"+ strUrl);
	}

	public static String NChk(String p_str){ if (p_str == null || "null".equals(p_str)){ p_str = ""; } return p_str;   }

	public static String F_REPLACE(String p_src, String p_tgt, String p_rpl_str){
		if("".equals(NChk(p_src))) return "";
        int j = 0, i = p_tgt.length();
        StringBuffer bs_buf = new StringBuffer();
        for(int k = 0; k > -1;){
            k = p_src.indexOf(p_tgt, j);
            if(k > -1){ bs_buf.append(p_src.substring(j, k)).append(p_rpl_str); j = k + i; }
        }
        bs_buf.append(p_src.substring(j, p_src.length()));
        return bs_buf.toString();
    }


	public  static String F_AttackXssCsrf(String p_src){

		String b_src_list[] = { "&",	"#",	"<",	">",	"(",	")",	"'", "\"" };

		String b_tgt_list[] = { "&smp;",	"&m35;",	"&lt;",	"&gt;",	"&#40;",	"&#41;",	"`", "&quot;"	};
		int b_cnt = b_src_list.length;
//		String rs_val = F_HAN(p_src);
		String rs_val = p_src;
        for(int k = 0; k < b_cnt; k++){ rs_val = F_REPLACE(rs_val, b_src_list[k], b_tgt_list[k]); }
//        rs_val = F_REPLACE(rs_val, "^!^", "&#");
        return rs_val;
    }

	public String F_ValPara(String p_src) { return F_AttackXssCsrf(p_src); } // 입력/수정 Value

//	치환해야 할 항목들을 한곳으로 모아서 처리
	public static String convertString(String str) {
	String strTemp;
	String strPrdDoc="";
	strPrdDoc = strPrdDoc.replace("\r\n", "<br>");
	strTemp = replace (str, "\'", "´");
	strTemp = replace (strTemp, "&", "&amp;");
	strTemp = replace (strTemp, "\"", "&quot;");
	strTemp = replace (strTemp, "<", "&lt;");
	strTemp = replace (strTemp, ">", "&gt;");

	//return checkNull(strTemp);
	return strTemp.trim();
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

}

