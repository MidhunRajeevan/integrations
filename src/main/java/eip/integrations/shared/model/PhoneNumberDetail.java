package eip.integrations.shared.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumberDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1638584875221826102L;
	@Schema(description = "Phone Label", example = "work")
	  private String label;

	  @Schema(description = "Country Code", example = "+971")
	  private String countryCode;

	  @Schema(description = "Phone", example = "43435353")
	  private String phone;

	  @Schema(description = "Extension", example = "1234")
	  private String extension;

	  @Schema(description = "Preferred Phone Flag", example = "true")
	  private Boolean preferred;

}
