package eip.integrations.vehicle.model;

import java.util.List;

import eip.integrations.shared.model.Response;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleFineResponse {
	private Response response;
	private String totalTicketsNo;
	private String totalFine;
	private String transactionRefernceNumber;
	private List<Beneficiary> beneficiaries;

}
