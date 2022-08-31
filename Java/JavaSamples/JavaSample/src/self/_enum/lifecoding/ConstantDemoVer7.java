package self._enum.lifecoding;

	enum Fruit7{
	    APPLE, PEACH, BANANA;
	}
	enum Company7{
	    GOOGLE, APPLE, ORACLE;
	}
	 
	public class ConstantDemoVer7 {
	     
	    public static void main(String[] args) {
	        /*
	        if(Fruit.APPLE == Company.APPLE){
	            System.out.println("과일 애플과 회사 애플이 같다.");
	        }
	        */
	        Fruit7 type = Fruit7.APPLE;
	        switch(type){
	            case APPLE:
	                System.out.println(57+" kcal");
	                break;
	            case PEACH:
	                System.out.println(34+" kcal");
	                break;
	            case BANANA:
	                System.out.println(93+" kcal");
	                break;
	        }
	    }
	}