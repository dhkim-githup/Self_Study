
public class string_buffer {

	static String strSta="staic";
	public static void main(String args[]) {
		 String aValue = "abcde";


			StringBuffer b = new StringBuffer();
			StringBuilder c = new StringBuilder();
			//for (int loop = 0; loop < 10000; loop++) {
				//a += aValue;
			//}

			for (int loop = 0; loop < 10; loop++) {
				b.append(aValue);
			}
			String temp = b.toString();
			strSta = b.toString();

			for (int loop = 0; loop < 10; loop++) {
				c.append(aValue);
			}
			String temp2 = c.toString();
			System.out.println("String buffer "+ b);
			//b.delete(0,b.capacity());
			b.setLength(0);
			System.out.println("String buffer "+ b);

	System.out.println(strSta.length());
	System.out.println(b.toString().length());
	System.out.println(System.currentTimeMillis());


	}
	/*
	public static void main(String args[]) {
		 String aValue = "abcde";
		for (int outLoop = 0; outLoop < 10; outLoop++) {
			String a = new String();
			StringBuffer b = new StringBuffer();
			StringBuilder c = new StringBuilder();
			//for (int loop = 0; loop < 10000; loop++) {
				//a += aValue;
			//}

			for (int loop = 0; loop < 10000; loop++) {
				b.append(aValue);
			}
			String temp = b.toString();

			for (int loop = 0; loop < 10000; loop++) {
				c.append(aValue);
			}
			String temp2 = c.toString();
		}

	System.out.println("OK");
	System.out.println(System.currentTimeMillis());


	}
	*/
}

