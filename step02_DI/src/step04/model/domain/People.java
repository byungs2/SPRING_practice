package step04.model.domain;


import java.util.ArrayList;

import lombok.Getter;

@Getter
public class People {
	private String name;
	private int age;
	
	private ArrayList<Car> cars;
	
	public People() {
		System.out.println("Primary Constructor");
	}
	public People(String name, int age, ArrayList<Car> cars) {
		System.out.println("Constructor");
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	public void setName(String name) {
		System.out.println("nameSetter");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("ageSetter");
		this.age = age;
	}
	
	public void setCars(ArrayList<Car> cars) {
		System.out.println("carSetter");
		this.cars = cars;
	}
	
}
