package com.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂：直接调用静态工厂的的静态方法就可返回Bean实例
 *
 */
public class StaticCarFactory {
	
	private static Map<String, Car> cars = new HashMap<String, Car>();
	
	static {
		cars.put("奥迪",new Car("奥迪", 400000.0));
		cars.put("大众",new Car("大众", 200000.0));
	}
	
	//静态工厂方法
	public static Car getCar(String brand) {
		return cars.get(brand);
	}
}
