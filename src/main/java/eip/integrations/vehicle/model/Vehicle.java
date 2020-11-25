package eip.integrations.vehicle.model;

import java.sql.Timestamp;

import eip.integrations.shared.enums.VehicleStatus;
import eip.integrations.shared.model.CodeName;
import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Vehicle {

  @Schema(description = "Unique Identifier for the Vehicle", example = "1")
  private Long id;

  @Schema(description = "Decentralized Identifier for the Vehicle", example = "did:rta:1GNCS18Z3M0115561")
  private String did;

  @Schema(description = "Source for the Decentralized ID", example = "rta")
  private String source;

  @Schema(description = "Natural Key from the Source", example = "1GNCS18Z3M0115561")
  private String sourceKey;

  @Schema(description = "Hash of all trackable attributes", example = "2fdc0177057d3a5c6c2c0821e01f4fa8d90f9a3bb7afd82b0db526af98d68de8")
  private String versionHash;

  @Schema(description = "Agency")
  private AgencyHeader agency;
  
  @Schema(description = "Owner")
  private AgencyHeader owner;

  @Schema(description = "Vehicle Category")
  private VehicleCategoryHeader VehicleCategory;

  @Schema(description = "Vehicle Identification Number", example = "1GNCS18Z3M0115561")
  private String vin;

  @Schema(description = "Plate")
  private Plate plate;

  @Schema(description = "Vehicle Make", example = "Toyota")
  private CodeName vehicleMake;

  @Schema(description = "Vehicle Model", example = "Fortuner")
  private CodeName vehicleModel;

  @Schema(description = "Vehicle Model Year", example = "2018")
  private Long modelYear;

  @Schema(description = "Vehicle Color", example = "Pearl White")
  private CodeName color;

  @Schema(description = "Vehicle Capacity", example = "5")
  private Long capacity;

  @Schema(description = "Vehicle Class")
  private LanguageMapper vehicleClass;

  @Schema(description = "Image URL")
  private String imageUrl;

  @Schema(description = "Vehicle Details")
  private VehicleDetails details;

  @Schema(description = "Posted to Blockchain")
  private Boolean isPosted;

  @Schema(description = "Status", example = "ACTIVE")
  private VehicleStatus status;

  @Schema(description = "Audit Field - Created By", example = "tars")
  private String createdBy;
  @Schema(description = "Audit Field - Updated By", example = "tars")
  private String updatedBy;
  @Schema(description = "Audit Field - Created Timestamp", example = "2020-04-04T16:04:04Z")
  private Timestamp createdAt;
  @Schema(description = "Audit Field - Updated Timestamp", example = "2020-04-04T16:04:04Z")
  private Timestamp updatedAt;
}
