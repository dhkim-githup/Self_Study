
public class test_indexOf {
	public test_indexOf() {
	}

	public static void main(String[] args) {		//
		String aa="../test.jsp";
		System.out.println("Result=>"+aa.indexOf(".js"));
		System.out.println("Result=>"+aa.indexOf("../"));
		System.out.println("Result=>"+aa.indexOf(";"));
		System.out.println("Result=>"+aa.indexOf("%0"));
		System.out.println("Result=>"+"5,.js,../,;,%0".indexOf(aa));

		if("124.108.66.124".indexOf("124.108.66") >= 0){
			System.out.println("Hooray"+"124.108.6.124".indexOf("124.108.66"));
		}

		if("/loading".indexOf("loading") >= 0){
			System.out.println("Loading"+"/loading".indexOf("loading"));
		}
		
		String str_a="B";
	 	if("DIRECT_LOGIN,SKTEL_LOGIN".indexOf(str_a) >= 0){
	 		System.out.println(" IndexOf null =>");
	 	}

	}
}
