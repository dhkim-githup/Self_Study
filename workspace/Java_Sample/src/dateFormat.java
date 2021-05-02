
import java.text.*;
import java.util.*;


public class dateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("DateFormat 사용 ");
		 DateFormat df = DateFormat.getDateInstance();
		 System.out.println(df.format(new java.util.Date()));


		System.out.println("Calendar 사용 ");
		java.util.Calendar cl = java.util.Calendar.getInstance();

		System.out.println("년도 >> " + cl.get(Calendar.YEAR));
		System.out.print("월	>> ");
		System.out.println(cl.get(Calendar.MONTH)+1); // Month 가 0부터 시작해서 발생함
		System.out.println("일	>> " + cl.get(Calendar.DATE));
		System.out.println("시간  >> " + cl.get(Calendar.HOUR));
		System.out.println("시간 24   >> " + cl.get(Calendar.HOUR_OF_DAY));
		System.out.println("분	>> " + cl.get(Calendar.MINUTE));
		System.out.println("초	 >> " + cl.get(Calendar.SECOND));
		System.out.println("년월=>"+ cl.get(Calendar.YEAR) + cl.get(Calendar.MONTH)+1 );

		System.out.println("SimpleDateFormat 사용 ");
		//SimpleDateFormat dateformat = new SimpleDateFormat(format);
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss"); // HH 24시간 hh 12시간 계산

		String today = sf.format(new java.util.Date());

		System.out.println("today : " + today);

		System.out.println("yyyy : " + today.substring(0,4).toString());
		System.out.println("MM : " + today.substring(4,6).toString());
		System.out.println("yyyymm : " + today.substring(0,6).toString());
		System.out.println("dd : " + today.substring(6,8).toString());
		System.out.println("HH : " + today.substring(8,10).toString());
		System.out.println("mmss : " + today.substring(10,14).toString());

		SimpleDateFormat sf2 = new SimpleDateFormat("yyyyMMdd");

		String today2 = sf.format(new java.util.Date());

		System.out.println("yyyymmdd : " + today2.toString());


		System.out.println("--------------------------------------------------------------------");


		GregorianCalendar cal=new GregorianCalendar();
		cal.add(Calendar.YEAR,0); //현재날짜에 3일을 더한다.
		System.out.println(cal.get(Calendar.MONTH) );
		cal.roll(Calendar.MONTH,13); //현재날짜에 3일을 더한다.
		System.out.println(cal.get(Calendar.MONTH) );
		//cal.add(cal.DAY_OF_MONTH,-3); //현재날짜에 -3일을 더한다.


		  java.util.Calendar now = java.util.Calendar.getInstance();
	        java.util.Date d = new java.util.Date();
	        now.setTime(d);

	        System.out.println( "Day=>"+now.get(now.DAY_OF_MONTH));
	        System.out.println( "Month=>"+now.get(java.util.Calendar.MONTH)+ 1);
	        System.out.println( "Year=>"+now.get(java.util.Calendar.YEAR));

	      java.util.Date serDate=new java.util.Date();          //  서버의 현재시간을 설정해 준다.	        
	        
	}

}
