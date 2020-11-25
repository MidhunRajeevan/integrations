package eip.integrations.vehicle.model;

import java.io.Serializable;
import java.util.List;

import eip.integrations.shared.model.Response;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor()
@NoArgsConstructor()
public class FetchVehicleResponse  implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1341669091941198649L;
	private Response response;
	private String transactionReferenceNumber;
	private String ownerId;
	private List<VehicleInfo> vehicleInfo;
}
