
public class substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_host="6214000,52";
		//str_host=str_host.substring(0,5);

		System.out.println(str_host.substring(0,1));
		System.out.println(str_host.substring(4,5));

		System.out.println(str_host);

		String a="김동현(";

			System.out.println("Length=>"+a.length());
			System.out.println(a.substring(0,3));
			System.out.println(a.substring(1,3));
			System.out.println(a.substring(0,4));
			//System.out.println(a.substring(7,12));

			String b="20100608";
			System.out.println(b.substring(2,8));

			String c="P9459045";
			System.out.println(c.substring(0,1));

		System.out.println("IndexOf");
		String tid="INIjspISP_speedmall120120103154313018658";
		String str_mid="speedmall2";
			if(tid.indexOf("speedmall1") >= 0){
				str_mid ="speedmall1";
			}
		System.out.println("tid=>"+tid+"=>"+tid.indexOf("speedmall1"));
		System.out.println("str_mid=>"+str_mid);
		System.out.println("10string =>" +tid.substring(10,20));

		String str_tid="INIjspCARDspeedmall220120209100347866334";
		System.out.println("10string =>" +str_tid.substring(10,20));


	}

}
