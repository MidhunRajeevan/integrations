package eip.integrations.shared.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Rate {

	@NotNull
	@Valid
	@Schema(description = "Rate for a Single Usage", example = "400.00")
	private Amount oneTimeRate;
	@NotNull
	@Valid
	@Schema(description = "Daily Rate", example = "400.00")
	private Amount dailyRate;
	@NotNull
	@Valid
	@Schema(description = "Weekly Rate", example = "1500.00")
	private Amount weeklyRate;
	@NotNull
	@Valid
	@Schema(description = "Monthly Rate", example = "2500.00")
	private Amount monthlyRate;
	@NotNull
	@Valid
	@Schema(description = "Yearly Rate", example = "20000.00")
	private Amount yearlyRate;

}
