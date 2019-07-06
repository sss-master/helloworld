package com.spring.bean.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class VipUserRepositoryImpl implements UserRepository {

	public void save() {
		System.out.println("VipUserRepositoryImpl save...");
	}

}
