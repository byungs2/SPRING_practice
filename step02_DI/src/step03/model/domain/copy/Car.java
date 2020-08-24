package step03.model.domain.copy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope("prototype")
public class Car {
	private String carName;
	private int carNo;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [carName=");
		builder.append(carName);
		builder.append(", carNo=");
		builder.append(carNo);
		builder.append("]");
		return builder.toString();
	}
}
