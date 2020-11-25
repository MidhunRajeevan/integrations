package eip.integrations.vehicle.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Features  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7723267390812580873L;
	@Schema(description = "Vehicle Feature Type", example = "")
    private LanguageMapper featureType;
    @Schema(description = "Vehicle Feature Type Value", example = "")
    private LanguageMapper featureTypeValue;
}
