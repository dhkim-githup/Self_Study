package self._call_by_what;

public class CallByReference {
	
	int value;

	public static void main(String[] args) {		
		CallByReference a = new CallByReference(10);
		CallByReference b = new CallByReference(20);

		System.out.println("swap() 호출 전 : a = " + a.value + ", b = " + b.value);
		swap(a, b);
		
		System.out.println("swap() 호출 전 : a = " + a.value + ", b = " + b.value);
	}
	
	
	CallByReference(int value) {
		this.value = value;
	}

	public static void swap(CallByReference x, CallByReference y) {
		int temp = x.value;
		x.value = y.value;
		y.value = temp;
	}
	
}
