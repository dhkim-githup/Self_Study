package Builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserBuilder_bakTest {

	@Test
	public void builderTest() {
	    User user = User.builder()	    		 
	    		      .name("ȫ�浿")	                  
	                  .age(19)
	                  .build();
	    System.out.println(user.getAge());
	  }

}
