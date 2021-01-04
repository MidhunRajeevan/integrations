package eip.integrations.agency.model;

import eip.integrations.shared.enums.AgencyStatus;
import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class AddAgencyRequest {
	
	private String did;
	private String trafficFileNumber;

	private String tradeLicenseNumber;
	
	@Schema(description = "Name in Arabic and English")
    private LanguageMapper name;

    @Schema(description = "Name in Arabic and English")
    private LanguageMapper chainName;
    
    @Schema(description = "Status of the Agency", example = "ACTIVE")
    private AgencyStatus status;

}
