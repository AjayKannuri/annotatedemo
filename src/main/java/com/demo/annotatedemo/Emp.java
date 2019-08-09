package com.demo.annotatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Emp {
	
	@Value("${myCompany}")
	private String company;
	
	@Value("Ravi")
	private String name;
	
	@Value("33")
	private int age;
	
	@Autowired
	@Qualifier("myaddr")
	private Address address;
	public Emp()
	{
		System.out.println("Emp object is created");
	}
	@Override
	public String toString() {
		return "Emp [company=" + company + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	

}
