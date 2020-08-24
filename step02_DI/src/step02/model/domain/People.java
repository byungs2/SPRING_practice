package step02.model.domain;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;

@Getter
public class People {
	private String name;
	private int age;
	
	@Autowired
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("People [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", car=");
		builder.append(car);
		builder.append("]");
		return builder.toString();
	}

}
