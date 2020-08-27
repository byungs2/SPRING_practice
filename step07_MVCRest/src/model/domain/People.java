package model.domain;

import lombok.Getter;

@Getter
public class People {
	private String name;
	private int age;

	public void setName(String name) {
		System.out.println("nameSetter");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("ageSetter");
		this.age = age;
	}
	
	public People(String name, int age) {
		System.out.println("Constructor");
		this.name = name;
		this.age = age;
	}

	public People() {
		System.out.println("Primary Constructor");
	}
	
}
