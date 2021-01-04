package eip.integrations.shared.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Email implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Schema(description = "Email Label", example = "personal")
	private String label;

	@Schema(description = "Email", example = "john.doe@example.com")
	private String email;

	@Schema(description = "Preferred Email Flag", example = "true")
	private Boolean preferred;
}
