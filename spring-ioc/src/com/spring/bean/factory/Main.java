package com.spring.bean.factory;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GenericXmlApplicationContext c = new GenericXmlApplicationContext("bean-factory.xml");
		Car c1 = c.getBean("car1", Car.class);
		System.out.println(c1);
		Car c2 = c.getBean("car2", Car.class);
		System.out.println(c2);
	}

}
