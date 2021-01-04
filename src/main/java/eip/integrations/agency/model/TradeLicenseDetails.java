package eip.integrations.agency.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class TradeLicenseDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3341443511559429796L;
	 @Schema(description = "Trade License Number of the Agency issued by DED", example = "456789")
	  private String licenseNo;

	  @Schema(description = "Trade License issued date", example = "2020-01-01")
	  private String issuedDate;

	  @Schema(description = "Trade License expiry date", example = "2021-09-01")
	  private String expiryDate;
}
