package team._annotaion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MainAnnotation {
	
	public static void main(String[] args) throws Exception, SecurityException {
			
		System.out.println("--------- MainAnnotation ---------");
		
		Eagle ms = new Eagle();
		
		String strCompany="";
		
				
		Method method = Eagle.class.getMethod("doFunc"); //자바 리플렉션 getMethod로 메서드 doFunc를 얻어온다
		Annotation[] annotations = method.getDeclaredAnnotations(); //메서드에 선언된 어노테이션 객체를 얻어온다
		        for (Annotation annotation : annotations) {
		            if (annotation instanceof AnnoBird) {
		            	AnnoBird annoBird = (AnnoBird) annotation;
		                System.out.println("name: " + annoBird.name()); //어노테이션에 지정한 값을 프린트한다
		            }
		        }		       
		
		
        Annotation annotation = Eagle.class.getMethod("doFunc") 
                            .getAnnotation(AnnoBird.class); //메서드 doFunc에 선언된 AnnoBird의 어노테이션 객체를 얻어온다

        if (annotation instanceof AnnoBird) {
        	AnnoBird myAnnotation = (AnnoBird) annotation;
            //System.out.println("name: " + myAnnotation.name());
        	strCompany = myAnnotation.name();
        }
		
        System.out.printf("\nThe annotation name is %s \n\n",strCompany);
        
		/* Bird ? or  */
		if("SPARROW,EAGLE,DOVE,SEAGULL".indexOf(strCompany) >= 0) {
			System.out.printf("Annotation Result : %s \n",ms.doFunc());
		}
		
	}	
}

@AnnoFish
class Shark{	
	
	public String doFunc() {
		return "doFunc";
	}
}


@Autowired(value = "HI", name = "name")
class Eagle{
	
	@AnnoBird(name = "Fish")  // value 는 기본값이다. WebServlet("/index"), RequestMapping("/index")
	public String doFunc() {
		return "We are Bird Familly";
	}
}