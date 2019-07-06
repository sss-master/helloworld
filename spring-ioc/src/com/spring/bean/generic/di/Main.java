package com.spring.bean.generic.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("bean-generic-di.xml");
		
		UserService us = context.getBean("userService", UserService.class);
		us.add();
	
	}

}
