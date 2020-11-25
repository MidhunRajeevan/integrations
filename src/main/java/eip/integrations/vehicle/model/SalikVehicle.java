package eip.integrations.vehicle.model;

import java.sql.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class SalikVehicle {
	@NotNull
	private Date StartDate;
	@NotNull
	private Date EndDate;
	@NotNull
	private SinglePlate Plate;
	
}
