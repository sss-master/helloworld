package com.spring.bean.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.bean.annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	private TestObject test;
	
	@Autowired(required = false)
	public void setTest(TestObject test) {
		this.test = test;
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepository save()...");
		System.out.println("test------------>"+test);
	}

}
