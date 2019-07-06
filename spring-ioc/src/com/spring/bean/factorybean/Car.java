package com.spring.bean.factorybean;

public class Car {
	
	private String brand;
	private Double price;
	
	public Car() {
		System.out.println("Car's Constructor...");
	}
	
	public Car(String brand, Double price) {
		this.brand = brand;
		this.price = price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
}
