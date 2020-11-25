package eip.integrations.vehicle.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class ChargeDetails {

	@Schema(description = "Tolls")
	private List<Toll> tolls;

	@Schema(description = "Tolls")
	private List<Fine> fines;

	@Schema(description = "Tolls")
	private List<Parking> parkings;

}
