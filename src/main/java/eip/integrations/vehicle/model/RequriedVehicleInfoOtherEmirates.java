package eip.integrations.vehicle.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class RequriedVehicleInfoOtherEmirates implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Schema(description = "Chassis Number",example = "1313oiuhui2yd999y7r97778")	
	private String vin;
	@NotNull
	private Date registrationDate;
	private SinglePlate plate;

}
