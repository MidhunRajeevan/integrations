package eip.integrations.vehicle.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapperWithID;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Insurance  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8773585512639195943L;
	@Schema(description = "Insurance Policy Type Details", example = "")
    private LanguageMapperWithID insuranceType;
    @Schema(description = "Insurance Company Details", example = "")
    private LanguageMapperWithID company;
    @Schema(description = "Insurance Expiry Date", example = "2019-01-23T00:00:00.000Z")
    private String expiryDate;
    @Schema(description = "Insurance Policy Number", example = "40/1020240")
    private String insuranceNumber;
    private String insuranceReferenceNumber;
    
}
