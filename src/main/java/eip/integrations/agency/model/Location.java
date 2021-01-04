package eip.integrations.agency.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Location implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2744022558612683181L;
	@Schema(description = "Longitude", example = "123")
	private String longitude;
	@Schema(description = "Latitude", example = "123")
	private String latitude;

}
