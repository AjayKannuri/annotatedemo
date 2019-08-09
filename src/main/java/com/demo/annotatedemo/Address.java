package com.demo.annotatedemo;

import org.springframework.stereotype.Component;

@Component("myaddr")
public class Address {
	private String state = "MH";
	private String city = "Pune";
	private int PIN = 546732;
	
	public Address() {
		System.out.println("Address object is created");
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", PIN=" + PIN + "]";
	}
	

}
