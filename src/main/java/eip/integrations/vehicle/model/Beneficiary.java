package eip.integrations.vehicle.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Beneficiary {
	 	
	    private String fineSource;	   
	    private String fineSourceAr;	   
	    private String noOfTickets;
	    private String trafficNo;
	    private List<VehicleFineInfo> fines;	    
}
