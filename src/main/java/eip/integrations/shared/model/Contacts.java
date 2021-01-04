package eip.integrations.shared.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacts {
	@Schema(description = "Addresses")
	private List<Address> addresses;

	@Schema(description = "Phones")
	private List<Phone> phones;

	@Schema(description = "Emails")
	private List<Email> emails;
}
