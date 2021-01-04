package eip.integrations.agency.model;

import java.io.Serializable;
import java.sql.Timestamp;

import eip.integrations.shared.enums.AgencyCategory;
import eip.integrations.shared.enums.AgencyStatus;
import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyResponse  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7134247986293710538L;
	@Schema(description = "Unique Identifier for the Agency", example = "1")
    private Long id;

    @Schema(description = "Decentralized Identifier for the Agency", example = "did:eid:784199952698752")
    private String did;
    
    private String trafficFileNumber;

    @Schema(description = "Source for the Decentralized ID", example = "eid")
    private String source;

    @Schema(description = "Natural Key from the Source", example = "784199952698752")
    private String sourceKey;

    @Schema(description = "Hash of all trackable attributes", example = "2fdc0177057d3a5c6c2c0821e01f4fa8d90f9a3bb7afd82b0db526af98d68de8")
    private String versionHash;
    
    @Schema(description = "Agency Name")
    private LanguageMapper name;

    @Schema(description = "Chain Name")
    private LanguageMapper chainName;

    @Schema(description = "Parent Agency")
    private AgencyHeader parent;
    
    private AgencyCategory category;
    
    @Schema(description = "Agency Details")
    private AgencyDetailsFetch details;

    @Schema(description = "Status of the Agency", example = "ACTIVE")
    private AgencyStatus status; 

    @Schema(description = "Audit Field - Created By", example = "tars")
    private String createdBy;
    @Schema(description = "Audit Field - Updated By", example = "tars")
    private String updatedBy;
    @Schema(description = "Audit Field - Created Timestamp", example = "2020-04-04T16:04:04Z")
    private Timestamp createdAt;
    @Schema(description = "Audit Field - Updated Timestamp", example = "2020-04-04T16:04:04Z")
    private Timestamp updatedAt;

}
