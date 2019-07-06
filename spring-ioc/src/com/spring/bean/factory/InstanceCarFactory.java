package com.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
  *  实例工厂:先创建实例工厂对象,再调用实例工厂的方法返回bean实例
 */
public class InstanceCarFactory {
	
	private Map<String, Car> cars = null;

	public InstanceCarFactory() {
		cars = new HashMap<String, Car>();
		cars.put("奥迪", new Car("奥迪", 400000.0));
		cars.put("福特", new Car("福特", 350000.0));
	}
	
	public Car getCar(String brand) {
		return cars.get(brand);
	}
	
}
