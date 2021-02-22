package eip.integrations.constants;

import java.util.Arrays;
import java.util.List;

@lombok.Data
public final class Constants {
	public static final String APPLICATIONID = "RTAPORTAL";
	public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
	public static final String NOT_FOUND = "NOT_FOUND";
	public static final String BAD_REQUEST = "BAD_REQUEST";
	public static final String UNAUTHORIZED = "UNAUTHORIZED";
	public static final String FORBIDDEN = "FORBIDDEN";
	public static final String PRECONDITION_FAILED = "PRECONDITION_FAILED";
	public static final String AGENCY_ID_ERR = "Agency Id should not be null and cannot be less that 100";
	public static final int ADD_VEHICLE_COUNT = 5;
	public static final String ADD_VEHICLE_COUNT_MSG = "Request should not have more than " + ADD_VEHICLE_COUNT + " vehicles";
	public static final String LIGHT_VEHICLE = "Light Vehicle";
	public static final String AGENCY_TRFFICC_NUMBER_DOESNOT_MATCH = "Agency traffic file number and trade license number does not match";
	public static final String AGENCY_ORG_ACTIVITY_CODE = "5";
	public static final String AGENCY_ACTIVITY_CODE_NOT_FOUND = "Agency Activity code not belongs to rental";
	public static final String SUCCESS = "SUCCESS";
	public static final String NO_RECORDS_FOUND = "No records found";
	public static final String NO_AGENCY_FOUND = "Agency Not Found";
	public static final String FAILED = "FAILED";
	public static final String INVALID_DRIVER_LICENSE = "Driver License is Invalid";
	public static final String INVALID_DRIVER_LICENSE_BLACKPOINTS = "Driver is Having More Black Points";
	public static final String INVALID_DRIVER_LICENSE_LIGHTVEHICLE = "Driver License doesn't Belongs to Light Vehicle";
	public static final String VALID_DRIVER_LICENSE = "Driver License is Valid";
	public static final String CONTEXT_TYPE_EMAIL = "text/html;charset=utf-8";
	public static final String FROM_EMAIL = "no-reply@rta.ae";
	public static final String AGENCY_CONTACT_ETRAFFIC_COMMERCIAL = "E-TRAFFIC-COMMERCIAL";
	public static final String AGENCY_CONTACT_ETRAFFIC_CORPORATE = "E-TRAFFIC-CORPORATE";
	public static final String AGENCY_CONTACT_DED = "DED";
	public static final String INVALID_AGENCY = "Please send the valid agency";
	public static final List<String> ON_BOARDING_CHANNEL = Arrays.asList("EMAIL","PORTAL");
	public static final List<String> MEETING_CHANNEL = Arrays.asList("EMAIL","PORTAL");
	public static final List<String> CONTRACT_CHANNEL = Arrays.asList("EMAIL","PORTAL");
	/*
	 * HashMap<String, List<String>> CHANNEL_MAPPING = new HashMap<String,
	 * List<String>>() { private static final long serialVersionUID = 1L; { //
	 * put("meeting", MEETING_CHANNEL); put("contract", CONTRACT_CHANNEL); //
	 * put("onboarding", ON_BOARDING_CHANNEL);
	 * put("DP_REQ_MEETING",MEETING_CHANNEL);
	 * put("DP_APPROVAL",ON_BOARDING_CHANNEL);
	 * put("MED_APPROVAL",ON_BOARDING_CHANNEL);
	 * put("MED_REQUEST_INFORMATION",ON_BOARDING_CHANNEL);
	 * put("DP_REQUEST_INFORMATION",ON_BOARDING_CHANNEL);
	 * 
	 * } };
	 */
    public static final  String AGENCY_SOURCE = "did:rta:";
	public Constants() {
		super();
	}
	public static final String MANDATORY_FIELDS_MISSING = "Mandatory fields missing";
	public static final String INT_REGEX = "[^0-9]+";
}
