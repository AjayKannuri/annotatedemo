package com.demo.annotatedemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.demo.annotatedemo")
@PropertySource("myresources.properties")
public class MyBeanConfig {
	
	

}



/*
 		@Autowired
 		Address address;                      //which  is used inside the employee one.........
		
		4th type of bean initialization..............
		@Bean(name={"myemp","uremp","eoemp"})
		public Emp abc(){
		
				return new Emp();
		}
		@Bean("human")
		@Scope("Prototype")
		public Person xyz()
		{
			return new Person();
		}
	


*/