package team._lamda;


public class HelloWorldLamda {
	 
	 /* Lamda 는 하나의 메서드만 허용 */
	@FunctionalInterface
	 interface HelloWorld {
	        public void greet();	        
	   }
	
	 /* Lamda 는 하나의 메서드만 허용 */
	@FunctionalInterface
	 interface HelloWorld2 {
	        public void greetSomeone(String someone);
	   }
	  
	    public void sayHello() {
	        
	    	/* 전통적인 인터페이스 구현체 */
	        class EnglishGreeting implements HelloWorld {
	            String name = "Hello";
	            public void greet() {
	                System.out.printf("%s world - Lamda \n",name);
	            }	           
	        }
	      
	        HelloWorld englishGreeting = new EnglishGreeting();
	        
	        /* 익명 클래스 사용 -> Lamda 식으로  */     
	        HelloWorld frenchGreeting = () -> {
	            String name = "tout le monde - Lamda";
	            System.out.println(name);
	        };
	        
	        /* 익명 클래스 사용 */
	        HelloWorld2 spanishGreeting = (String someone) -> {
	        	String name = someone;
	        	System.out.printf("Hola, %s , Lamda \n", name);
	        };
	        
	        
	        /* 인터페이스 구현체 실행 */
	        englishGreeting.greet();
	        
	        /* 익명클래스 실행 */
	        frenchGreeting.greet();
	        
	        /* 익명클래스 실행  */
	        spanishGreeting.greetSomeone("Ronaldo");
	    }

	    public static void main(String... args) {
	    	HelloWorldLamda myApp =
	            new HelloWorldLamda();
	        myApp.sayHello();
	        
	    
	    }            
	}