

public class testReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		// TODO Auto-generated method stub
		String str_test1="My <br>' Story' <br> ";
		str_test1=str_test1.replace("'", "\"");
		str_test1=str_test1.replace("<br>", " ");
		str_test1=str_test1.replaceAll("<br>", " ");
		str_test1 = str_test1.replace('"', '˝');
		str_test1 = str_test1.replace("'", "′");
		System.out.println(str_test1);

		String str_test2="2000005693-00060<br>";
		System.out.println(str_test2.replaceAll("<br>-", ""));
		
		String str_test3="234,2324,244";
		System.out.println(str_test3.replaceAll(",", ""));

	}
}
