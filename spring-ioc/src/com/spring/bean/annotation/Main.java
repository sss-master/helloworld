package com.spring.bean.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.bean.annotation.controller.UserController;
import com.spring.bean.annotation.repository.UserRepository;
import com.spring.bean.annotation.repository.UserRepositoryImpl;
import com.spring.bean.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {

		GenericXmlApplicationContext c = new GenericXmlApplicationContext("bean-annotation.xml");
		
//		TestObject to = c.getBean("testObject", TestObject.class);
//		System.out.println(to);
		
		UserController uc = c.getBean("userController", UserController.class);
		System.out.println(uc);
		uc.execute();
		
//		UserService us = c.getBean("userService", UserService.class);
//		System.out.println(us);
//		
//		UserRepository uri = c.getBean("userRepository", UserRepositoryImpl.class);
//		System.out.println(uri);
	}

}
