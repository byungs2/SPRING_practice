package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Customer2 {
	private String name2;
	private int age2;
	
	public Customer2() {
		System.out.println("Customer 기본 생성자");
	}
}
