
import java.text.*;

public class numberFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int int_01 = 1234567891;
		long long_01 = 1234567891234567891L;
	    double double_01 = 12345678912345.99;

		// TODO Auto-generated method stub

	     // 선언문
		 NumberFormat nft = NumberFormat.getInstance();

		 System.out.println("Double ==> normal ");
		 System.out.println("nft.format(int_01)    >> " + nft.format(int_01));
		 System.out.println("nft.format(long_01)   >> " + nft.format(long_01));
		 System.out.println("nft.format(double_01) >> " + nft.format(double_01));

		 nft.setMaximumFractionDigits(0); // 소수점 최대자리수 .. 뒤의 소수점 반올림
		 nft.setMinimumFractionDigits(0); // 소수점 최소자리수 .. 소수점이 없을경우 0 표시

		 System.out.println("Double ==> dot ");
		 System.out.println("nft.format(int_01)    >> " + nft.format(int_01));
		 System.out.println("nft.format(long_01)   >> " + nft.format(long_01));
		 System.out.println("nft.format(double_01) >> " + nft.format(double_01));

		 System.out.println("Double ==> math ");

		 System.out.println("nft.format(long_01) 절대값  >> " + (long)Math.ceil(double_01));
		 System.out.println("nft.format(long_01) 올림  >> " + (long)Math.ceil(double_01));
		 System.out.println("nft.format(double_01)반올림 >> " + (long)Math.round(double_01));
		 System.out.println("nft.format(double_01) 절사값 >> " + (long)Math.floor(double_01));
	}



}
