package com.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class beanlist {

	@Autowired
	DefaultListableBeanFactory df;
	
	@Autowired
    private ApplicationContext applicationContext;

	@RequestMapping("/mybean")
	public String myBean() {
		
		String strBean="";
		int count=0;
		
		for(String str : df.getBeanDefinitionNames()) {
			strBean += df.getBean(str).getClass().getName() + "<br>";  
			count++;
		}
		
		return "Total : "+count+"<p>"+strBean;
	}
	
	@RequestMapping("/mybean2")
    public String contextLoads() throws Exception {
		String strBean="";
		int count=0;
        if (applicationContext != null) {
            String[] beans = applicationContext.getBeanDefinitionNames();

            for (String bean : beans) {
                System.out.println("bean : " + bean);
                strBean += bean + "<br>";  
    			count++;
            }
        }
        
        return "Total : "+count+"<p>"+strBean;
        
    }
	
	
	
}
