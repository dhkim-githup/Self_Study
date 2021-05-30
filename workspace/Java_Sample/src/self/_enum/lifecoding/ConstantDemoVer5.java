package self._enum.lifecoding;

	public class ConstantDemoVer5 {
	     
	    public static void main(String[] args) {
	        int type = IF_FRUIT.APPLE;
	        switch(type){
	            case IF_FRUIT.APPLE:
	                System.out.println(57+" kcal");
	                break;
	            case IF_FRUIT.PEACH:
	                System.out.println(34+" kcal");
	                break;
	            case IF_FRUIT.BANANA:
	                System.out.println(93+" kcal");
	                break;
	        }
	    }

}
	
	interface IF_FRUIT{
	    int APPLE=1, PEACH=2, BANANA=3;
	}
	interface IF_COMPANY{
	    int GOOGLE=1, APPLE=2, ORACLE=3;
	}

