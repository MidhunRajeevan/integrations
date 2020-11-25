package eip.integrations.vehicle.model;

import java.util.List;

import eip.integrations.shared.model.CodeName;
import eip.integrations.shared.model.Rate;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class VehicleDetails {

  @Schema(description = "Fuel Type")
  private CodeName fuelType;

  @Schema(description = "Country of Origin")
  private CodeName countryOfOrigin;

  @Schema(description = "Number of Doors", example = "5")
  private Long numberOfDoors;

  @Schema(description = "Chassis Number", example = "SV30-0169266")
  private String chassisNumber;

  @Schema(description = "Engine Number", example = "52WVC10388")
  private String engineNumber;

  @Schema(description = "Engine Capacity in CC", example = "2694")
  private Long engineCapacity;

  @Schema(description = "Due for Test")
  private Boolean isDueForTest;

  @Schema(description = "Registration")
  private VehicleRegistration registration;

  @Schema(description = "Features")
  private List<CodeName> features;

  @Schema(description = "Insurance")
  private VehicleInsurance insurance;
  
  @Schema(description = "Vehicle Rates")
  private Rate rates;
}
