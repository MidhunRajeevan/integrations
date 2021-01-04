package eip.integrations.agency.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoLocation {
	
	@Schema(description = "Agency  GeoLocation type ", example = "Feature")
	private String type;
	private GeometryDetail geometry;
	@Schema(description = "Agency  GeoLocation properties ", example = "properties")
	private String properties;

}
