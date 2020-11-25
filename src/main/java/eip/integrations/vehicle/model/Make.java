package eip.integrations.vehicle.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Make implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2637937194146311224L;
	@Schema(description = "Vehicle Manufacturer ID", example = "12")
    private String makeId;
    @Schema(description = "Vehicle Manufacturer Type", example = "")
    private LanguageMapper  ManufacturerType;
    @Schema(description = "Manufacturer Status", example = "")
    private String  manufactureStatus;
}
