package eip.integrations.shared.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class CreateAndUpdateMapper implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5023566416804860934L;
	@Schema(description = "Emplyee Id", example = "12")
    private String rentalAgencyEmployeeId;
    @Schema(description = "Created/Updated Date", example = "2015-10-05T00:00:00.000Z")
    private String at;
}
