package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Customer {
	private String id;
	private int age;
	
	public Customer() {
		System.out.println("Customer 기본 생성자");
	}
}
