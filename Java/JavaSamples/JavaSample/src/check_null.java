
public class check_null {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_1 = "  Kim Dong Hyun ";

		System.out.println(str_1);
		System.out.println(checkNull(str_1));
		System.out.println(checkNull(str_1,"---"));

	}

	public static String checkNull(String s) {
		if (s == null)
			return "";
		else
			return trim(s);
	}

	/**
	 * 널값처리
	 * @param s
	 * @param v
	 * @return
	 */
	public static String checkNull(String s, String v) {
		if (s == null)
			return v;
		else
			return trim(s);
	}

	/**
	 * 한글에대한 'ㄱ'빈값을 없애준다.
	 * @param s
	 * @return
	 */
	public static String trim(String s) {
		int i = 0;
		char ac[] = s.toCharArray();
		int j = ac.length;
		int k;
		for (k = j; i < k && (ac[i] <= ' ' || ac[i] == '\u3000'); i++)
			;
		for (; i < k && (ac[k - 1] <= ' ' || ac[k - 1] == '\u3000'); k--)
			;
		return i <= 0 && k >= j ? s : s.substring(i, k);
	}

}
