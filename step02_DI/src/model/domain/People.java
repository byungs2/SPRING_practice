package model.domain;

import lombok.Getter;

@Getter
public class People {
	private String name;
	private int age;
	private Car car;
	
	public People() {
		System.out.println("Primary Constructor");
	}
	public People(String name, int age, Car car) {
		System.out.println("Constructor");
		this.name = name;
		this.age = age;
		this.car = car;
	}
	public void setName(String name) {
		System.out.println("nameSetter");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("ageSetter");
		this.age = age;
	}
	
	public void setCar(Car car) {
		System.out.println("carSetter");
		this.car = car;
	}

}
