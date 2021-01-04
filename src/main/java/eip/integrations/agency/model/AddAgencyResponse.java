package eip.integrations.agency.model;

import java.sql.Timestamp;

import eip.integrations.shared.enums.AgencyCategory;
import eip.integrations.shared.enums.AgencyStatus;
import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class AddAgencyResponse {
	
	@Schema(description = "Unique Identifier for the Agency", example = "1")
    private Long id;

    @Schema(description = "Decentralized Identifier for the Agency", example = "did:eid:784199952698752")
    private String did;

    @Schema(description = "Source for the Decentralized ID", example = "eid")
    private String source;
    
    private String trafficFileNumber;
    
    private String tradeLicenseNumber;

    @Schema(description = "Natural Key from the Source", example = "784199952698752")
    private String sourceKey;

    @Schema(description = "Hash of all trackable attributes", example = "2fdc0177057d3a5c6c2c0821e01f4fa8d90f9a3bb7afd82b0db526af98d68de8")
    private String versionHash;

    @Schema(description = "Name in Arabic and English")
    private LanguageMapper name;

    @Schema(description = "Name in Arabic and English")
    private LanguageMapper chainName;

    private AgencyHeader parent;

    @Schema(description = "Category of the Agency", example = "A")
    private AgencyCategory category;

    @Schema(description = "Status of the Agency", example = "ACTIVE")
    private AgencyStatus status;

	/*
	 * @Schema(description = "Check with Agency is Active", example = "true")
	 * private Boolean isActive;
	 * 
	 * @Schema(description = "Check with Agency is Archived", example = "true")
	 * private Boolean isArchived;
	 */

    @Schema(description = "Audit Field - Created By", example = "tars")
    private String createdBy;
    @Schema(description = "Audit Field - Updated By", example = "tars")
    private String updatedBy;
    @Schema(description = "Audit Field - Created Timestamp", example = "2020-04-04T16:04:04Z")
    private Timestamp createdAt;
    @Schema(description = "Audit Field - Updated Timestamp", example = "2020-04-04T16:04:04Z")
    private Timestamp updatedAt;

}
