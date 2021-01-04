package eip.integrations.shared.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Value {
	@Email
	@NotEmpty(message = "Value field cannot be empty")
	private String value;
}
