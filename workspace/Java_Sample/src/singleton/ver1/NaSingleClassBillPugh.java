package singleton.ver1;

public class NaSingleClassBillPugh {
	
	private static String strName="pugh";
	
	// 생성자가 private , new 접근 할 수 없음
	private NaSingleClassBillPugh() {}
	
	private static class NaSingleClassBillPughHolder{
		private static NaSingleClassBillPugh instance = new NaSingleClassBillPugh();
	}
	
	public static NaSingleClassBillPugh getInstance() {
		System.out.println("NaSingleClassBillPugh - getInstance");
		return NaSingleClassBillPughHolder.instance;
	}
	
	public String getStrName() {
		return strName;
	}
	
	public void setStrName(String strName) {
		this.strName = strName;
	}
	

}
