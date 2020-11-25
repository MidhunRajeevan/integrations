package eip.integrations.vehicle.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class VehicleLookupRequest {

	@Schema(description = "Traffic File Number Number", example = "1015823")
	private String trafficFileNumber;

	@Schema(description = "Vehicle Details")
	private List<VehicleRequestNew> vehicles;

}