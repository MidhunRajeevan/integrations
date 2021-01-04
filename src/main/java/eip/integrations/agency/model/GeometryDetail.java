package eip.integrations.agency.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class GeometryDetail {
	
	@Schema(description = "Geometry Type", example = "abc")
	private String type;
	private List<String> coordinates;
}
