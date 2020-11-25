package eip.integrations.vehicle.model;

import eip.integrations.shared.model.Response;

@lombok.Data
public class FetchVehicleCategory {

	private Response response;
	private VehicleCategory category;

}
