package eip.integrations.shared.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Contact {
	
	  @Schema(description = "Addresses")
	  private List<Address> addresses;

	  @Schema(description = "Phones")
	  private List<PhoneNumberDetail> phones;

	  @Schema(description = "Emails")
	  private List<Email> emails;

}
