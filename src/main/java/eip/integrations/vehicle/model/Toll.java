package eip.integrations.vehicle.model;


import java.util.Date;

import eip.integrations.shared.model.Amount;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Toll {
	/*
	 * private int totalCount; private List<ViewOrSearchTripsResultType.Trips>
	 * trips;
	 */

	@Schema(description = "Issued Date", example = "2020-09-01")
	private Date issueDate;

	@Schema(description = "Reference", example = "W249284234")
	private String reference;

	@Schema(description = "Location", example = "Dubai Toll")
	private String location;

	@Schema(description = "Amount")
	private Amount value;
}