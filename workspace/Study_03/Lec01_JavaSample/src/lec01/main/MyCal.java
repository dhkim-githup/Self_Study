package lec01.main;

import lec01.app.IfCal;

public class MyCal {
	
	public int iFirst, iSecond;
		
	IfCal ifcal;

	public MyCal(int iFirst, int iSecond, IfCal ifcal) {
		super();
		this.iFirst = iFirst;
		this.iSecond = iSecond;
		this.ifcal = ifcal;
	}
	
	
	public void result() {
		int iValue = ifcal.cal(this.iFirst,this.iSecond);
		System.out.println("Result "+ iValue);
	}
	
	
	
	
	
}
