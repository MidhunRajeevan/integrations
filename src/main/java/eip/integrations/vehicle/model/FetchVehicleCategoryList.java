package eip.integrations.vehicle.model;

import java.util.List;

import eip.integrations.shared.model.Response;

@lombok.Data
public class FetchVehicleCategoryList {
	private Response response;
	private List<VehicleCategory> category;

}
