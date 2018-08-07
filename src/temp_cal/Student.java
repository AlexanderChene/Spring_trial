package temp_cal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	
	private String firstname;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastname;
	
	@NotNull(message="Your height is required")
	@Min(value=50, message="You cannot be shorter than 50 centimeter")
	@Max(value=400, message="You can not be taller than 500 centimeters...")
	private Double height;
	
	@NotNull(message="Your weight is required")
	@Min(value=10, message="You cannot be lighter than 10 kilograms")
	@Max(value=600, message="You cannot be heavier than 600 kilograms")
	private Double weight;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	
	
	

}
