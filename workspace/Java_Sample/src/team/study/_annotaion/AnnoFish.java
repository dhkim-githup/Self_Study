package team.study._annotaion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * this program is for Fish
 * @author dhkim 
 */

@Documented
@Target(ElementType.TYPE) // Target 을 설정하지 않으면, All  
@Retention(RetentionPolicy.SOURCE) // SOURCE, CLASS, RUNTIME
public @interface AnnoFish{			
}