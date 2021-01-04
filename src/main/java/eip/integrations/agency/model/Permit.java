package eip.integrations.agency.model;

import java.io.Serializable;
import java.util.List;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Permit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4505010563723335261L;
	  @Schema(description = "Permit Number of the Agency issued by RTA", example = "12345678")
	  private String permitNo;

	  @Schema(description = "Traffic Number related to the permit", example = "12345678")
	  private String reference;

	  @Schema(description = "Permit Issued Date", example = "2020-01-01")
	  private String issuedDate;

	  @Schema(description = "Permit Expiry Date", example = "2020-12-31")
	  private String expiryDate;

	  @Schema(description = "Authority who issued the permit in Arabic and English")
	  private LanguageMapper authorityName;

	  @Schema(description = "List of Permit Owners")
	  private List<String> owners;

	  @Schema(description = "List of Permit Managers")
	  private List<String> managers;
}
