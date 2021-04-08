
public class runExe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String sProc = "C:\\Manual.txt";

			  Runtime runtime = Runtime.getRuntime();
			  Process process = null;
			  process = runtime.exec(sProc);
		   } catch(Exception e) {
		    System.out.println(e);
		   }

	}

}
