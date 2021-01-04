package eip.integrations.agency.model;

@lombok.Data
public class CommercialInstRequest {
	
	private Long trafficFileNumber;
	private Long tradeLicenseNumber;
	private String startDateTime;
	private String endDateTime;

}
