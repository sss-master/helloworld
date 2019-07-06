package com.spring.bean.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 泛型依赖注入
 */
public class BaseService<T> {
	
	@Autowired
	protected BaseRepository<T> repository;
	
	public void add() {
		System.out.println("add...");
		System.out.println(repository);
	}
}
