package com.spring.bean.factorybean;

import org.springframework.beans.factory.FactoryBean;


/**
 * 自定义的FactoryBean需要实现FactoryBean接口
 *
 */
public class CarFactoryBean implements FactoryBean<Car> {
	
	private String brand;
	private Double price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//返回Bean的对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, price);
	}
	
	//返回bean的类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

}
