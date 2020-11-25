package eip.integrations.vehicle.model;

import java.io.Serializable;

import eip.integrations.shared.model.CreateAndUpdateMapper;
import eip.integrations.shared.model.LanguageMapperWithID;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class VehicleInfo  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4194867302081187743L;
	@Schema(description = "Vehicle Id in TARS", example = "1")
    private String id;
	private String uid;
    @Schema(description = "Manufacturer Details", example = "")
    private Make make;
    @Schema(description = "Vehicle Model Deatils", example = "")
    private LanguageMapperWithID model;
    @Schema(description = "Model Status", example = "")
    private String trim;
    @Schema(description = "Chassis Number", example = "MB1PBEFB9GU1A1608")
    private String vin;
    @Schema(description = "Year of Manufacture", example = "2016")
    private String year;
    @Schema(description = "Number of Seats", example = "59")
    private String capacity;
    @Schema(description = "Vehicle Class Details", example = "")
    private LanguageMapperWithID classDescription;
    @Schema(description = "Vehicle Color Details", example = "")
    private LanguageMapperWithID color;
    private boolean isDueForTest;
    @Schema(description = "Vehicle Type Name", example = "")
    private LanguageMapperWithID typeName;
    @Schema(description = "Vehicle Valididty Period")
    private String validityPeriod;
    @Schema(description = "Vehicle Valid", example = "true")
    private boolean isValid;
    @Schema(description = "Status", example = "")
    private String status;
    @Schema(description = "Details of Vehicle created Employee", example = "")
    private CreateAndUpdateMapper created;
    @Schema(description = "Details of Vehicle updated Employee", example = "")
    private CreateAndUpdateMapper updated;
    @Schema(description = "Remarks related to Vehicle", example = "")
    private String remarks;
    @Schema(description = "Vehicle Registration Details", example = "")
    private Registration registration;
    @Schema(description = "Vehicle Category Details", example = "")
    private VehicleCategory category;
    @Schema(description = "Vehicle Plate Details", example = "")
    private PlateOld plate;
    private VehicleDetailsOld vehicleDetails;
    private boolean isPosted;
}
