package eip.integrations.vehicle.model;

import java.io.Serializable;
import java.util.List;

import eip.integrations.shared.model.LanguageMapper;
import eip.integrations.shared.model.LanguageMapperWithID;

@lombok.Data
public class VehicleDetailsOld implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4942268448431988581L;
	private LanguageMapperWithID fueltype;
	private int numberOfDoors;
    private String engineNumber;
    private String fuelLevel;
    private long odometerReading;
    private LanguageMapper dueForTestDescription;
    private String photo;
    private LanguageMapper emirateExportFrom;
    private List<Features> features;
    private Insurance insurance;
    private LanguageMapperWithID vehicleCountry;
    private LanguageMapperWithID vehicleDescription;
    
}
