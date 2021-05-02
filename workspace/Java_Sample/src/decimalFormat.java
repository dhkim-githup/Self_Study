
import java.text.DecimalFormat;

public class decimalFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int_01 = 1234567891;
		long long_01 = 1234567891234567891L;
	    double double_01 = 12345678912345.51;
	    double double_total = 12345567891234.0;
	    long long_total = 1234567891;
	    double td=0;

	    int a=123456789, b=100;
	    //double_total = Double.parseDouble(a*b));
	    //double_total=a*b;
	    td=double_01+int_01;

	    String stra="123456789";
	    td = Double.parseDouble(stra);

	    System.out.println("    >> " + (td) + "/"+a);
		// TODO Auto-generated method stub
	    int intSpeedPoint = (int)Math.floor(5500*0.01);
	    System.out.println("Double ==> normal "+intSpeedPoint);
	    intSpeedPoint = (int)Math.floor(intSpeedPoint*0.1)*10;
	    System.out.println("Double ==> normal "+intSpeedPoint);

	    DecimalFormat df = new  DecimalFormat("#,###");
	    System.out.println("nft.format(long_01)   >> " + df.format(double_01));

	    df = new  DecimalFormat("0,000");
	    System.out.println("nft.format(long_01)   >> " + df.format(double_01));

	    df = new  DecimalFormat("#");
	    System.out.println("nft.format(long_01)   >> " + df.format(double_01));

	    df = new  DecimalFormat("0");
	    System.out.println("nft.format(long_01)   >> " + df.format(double_01));

	    df = new  DecimalFormat("#.##");
	    System.out.println("nft.format(long_01)   >> " + df.format(double_01));

	    df = new  DecimalFormat("0.0");
	    System.out.println("nft.format(long_01)   >> " + df.format(double_01));


	    /*
	     // 선언문
		 DecimalFormat df = new  DecimalFormat("#,###");
		 System.out.println("nft.format(long_01)   >> " + df.format(double_01));

		 System.out.println("Double ==> normal ");
		 System.out.println("nft.format(int_01)    >> " + df.format(int_01));
		 System.out.println("nft.format(long_01)   >> " + df.format(long_01));
		 System.out.println("nft.format(double_01) >> " + df.format(double_01));
		 System.out.println("nft.format(double_01) 절사값 >> " + df.format(Math.floor(double_01)));
		*/
		 /*
		 df.setMaximumFractionDigits(2); // 소수점 최대자리수 .. 뒤의 소수점 반올림
		 df.setMinimumFractionDigits(2); // 소수점 최소자리수 .. 소수점이 없을경우 0 표시
		 System.out.println("Double ==> dot ");
		 System.out.println("nft.format(int_01)    >> " + df.format(int_01));
		 System.out.println("nft.format(long_01)   >> " + df.format(long_01));
		 System.out.println("nft.format(double_01) >> " + df.format(double_01));

		/*
		 System.out.println("Double ==> math ");
		 System.out.println("nft.format(long_01) 절대값  >> " + (long)Math.ceil(double_01));
		 System.out.println("nft.format(long_01) 올림  >> " + (long)Math.ceil(double_01));
		 System.out.println("nft.format(double_01)반올림 >> " + (long)Math.round(double_01));
		 System.out.println("nft.format(double_01) 절사값 >> " + (long)Math.floor(double_01));

		 System.out.println("nft.format(int_01)    >> " + df.format(td));
		*/

	}

}
