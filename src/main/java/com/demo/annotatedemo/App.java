package com.demo.annotatedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);  // trying to use java file as xml configuration
    	
    	Emp e1 = (Emp) context.getBean("emp");
    	System.out.println(e1);
    	
    	Person p1 = (Person) context.getBean("person");
    	System.out.println(p1);
    }
}
