package com.spring.bean.factorybean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		GenericXmlApplicationContext c = new GenericXmlApplicationContext("bean-factorybean.xml");
		Car car = c.getBean("car",Car.class);
		System.out.println(car);
	}

}
