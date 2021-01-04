package eip.integrations.agency.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Partner implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8148463060705748093L;
	@Schema(description = "Partner Number", example = "10088")
	private String partnerNo;

	@Schema(description = "Partner Name in Arabic and English")
	private LanguageMapper name;

	@Schema(description = "Emirtates ID", example = "1122646554")
	private String emiratesId;

	@Schema(description = "Passport Number", example = "791234567")
	private String passportNumber;

	@Schema(description = "Nationality of the Partner", example = "United Kingdom")
	private String nationality;

	@Schema(description = "Date of Birth", example = "1959-05-23")
	private String birthDate;

	@Schema(description = "Category of the Person", example = "Person")
	private String personCategory;

	@Schema(description = "Legal Type of the Partner", example = "Partner")
	private String legalType;

	@Schema(description = "Ownership Percentage", example = "100")
	private String percentOwnership;

	@Schema(description = "Ownership Percentage", example = "100")
	private String residenceNumber;

	@Schema(description = "Effective Start Date", example = "2020-01-01")
	private String effectiveStartDate;

	@Schema(description = "Effective End Date", example = "2020-12-31")
	private String effectiveEndDate;

}
