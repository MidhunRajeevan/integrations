package eip.integrations.shared.model;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Passport {
	
	 @Schema(description = "Passport Type", example = "REGULAR")
	  private String passportType;

	  @Schema(description = "Passport Number", example = "791234567")
	  private String passportNumber;

	  @Schema(description = "Passport Issuing Country", example = "United Kingdom")
	  private String issuedCountry;

	  @Schema(description = "Passport Issued Place", example = "London")
	  private String issuedPlace;

	  @Schema(description = "Passport Issued Date", example = "2015-09-01")
	  private String issuedDate;

	  @Schema(description = "Passport Expiry Date", example = "2025-08-31")
	  private String expiryDate;
}
