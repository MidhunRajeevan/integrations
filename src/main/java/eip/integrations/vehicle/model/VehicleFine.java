package eip.integrations.vehicle.model;


import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleFine {
	@NotNull
	private SinglePlate Plate;
	@NotNull
	private Date StartDate;
	@NotNull
	private Date EndDate;

}
