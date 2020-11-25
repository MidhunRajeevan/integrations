package eip.integrations.vehicle.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class VehicleRequestNew {

	@Schema(description = "Vehicle Identification Number", example = "1GNCS18Z3M0115561")
	private String vin;

	@Schema(description = "Plate")
	private Plate plate;

}
