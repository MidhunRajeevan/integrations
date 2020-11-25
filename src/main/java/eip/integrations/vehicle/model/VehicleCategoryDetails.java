package eip.integrations.vehicle.model;

import java.io.Serializable;

import eip.integrations.shared.model.Amount;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class VehicleCategoryDetails  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7980568430012801156L;
	@Schema(description = "One Time Rate")
	private Amount oneTimeRate;
	@Schema(description = "Daily Rate")
	private Amount dailyRate;
	@Schema(description = "Weekly Rate")
	private Amount weeklyRate;
	@Schema(description = "Monthly Rate")
	private Amount monthlyRate;
	@Schema(description = "Yearly Rate")
	private Amount yearlyRate;

}
