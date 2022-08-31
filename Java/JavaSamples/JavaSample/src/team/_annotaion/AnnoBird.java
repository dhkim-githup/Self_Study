package team._annotaion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * this program is for Bird
 * @author dhkim 
 */
@Documented
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface AnnoBird {
	
	/* annotation elements 
	 * value() is default 
	 * */
	String name() default "";
	
}
