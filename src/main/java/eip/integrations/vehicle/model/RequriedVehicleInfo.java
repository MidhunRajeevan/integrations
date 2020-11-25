package eip.integrations.vehicle.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class RequriedVehicleInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6782387264932260439L;
	@Schema(description = "Chassis Number",example = "1313oiuhui2yd999y7r97778")	
	private String vin;
	private SinglePlate plate;
}
