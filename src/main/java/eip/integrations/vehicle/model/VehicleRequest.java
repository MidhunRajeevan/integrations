package eip.integrations.vehicle.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class VehicleRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5608947605286776389L;
	@Schema(description = "Traffic File Number",example = "1397778")
	private String trafficFileNumber;
	private List<RequriedVehicleInfo> vehicleInfo;
}
