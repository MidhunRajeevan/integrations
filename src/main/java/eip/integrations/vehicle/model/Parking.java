package eip.integrations.vehicle.model;

import java.sql.Date;

import eip.integrations.shared.model.Amount;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Parking {

	@Schema(description = "Issued Date", example = "2020-09-01")
	private Date issueDate;

	@Schema(description = "Reference", example = "W249284234")
	private String reference;

	@Schema(description = "Amount")
	private Amount value;

}