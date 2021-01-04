package eip.integrations.agency.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2233967488800080677L;
	@Schema(description = "Describes whether the company is HQ or Branch", example = "head quarter")
	  private LanguageMapper licenseType;

	  @Schema(description = "The legal type of the establishment", example = "individual")
	  private LanguageMapper legalType;

	  @Schema(description = "Organization Class Description", example = "individual")
	  private LanguageMapper classDescription;

	  @Schema(description = "Entity representing the organization", example = "self")
	  private LanguageMapper representedBy;

	  @Schema(description = "Permit Number of the Agency issued by RTA", example = "12345678")
	  private String issuedDate;

	  @Schema(description = "Permit Number of the Agency issued by RTA", example = "12345678")
	  private String expriyDate;

}
