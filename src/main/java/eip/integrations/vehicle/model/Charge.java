package eip.integrations.vehicle.model;

import java.sql.Timestamp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Charge {

  @Schema(description = "Unique Identifier for the Charge", example = "1")
  private Long id;

  @Schema(description = "Decentralized Identifier for the Charge", example = "did:salik:12345")
  private String did;

  @Schema(description = "Source for the Decentralized ID", example = "salik")
  private String source;

  @Schema(description = "Natural Key from the Source", example = "12345")
  private String sourceKey;

  @Schema(description = "Hash of all trackable attributes", example = "2fdc0177057d3a5c6c2c0821e01f4fa8d90f9a3bb7afd82b0db526af98d68de8")
  private String versionHash;

  @Schema(description = "Vehicle")
  private VehicleHeader vehicle;

  @Schema(description = "Charge Created Timestamp", example = "2020-06-15T12:29:30Z")
  private Timestamp chargedOn;

  @Schema(description = "Details")
  private ChargeDetails chargeDetails;

  @Schema(description = "Audit Field - Created By", example = "tars")
  private String createdBy;
  @Schema(description = "Audit Field - Updated By", example = "tars")
  private String updatedBy;
  @Schema(description = "Audit Field - Created Timestamp", example = "2020-06-15T12:30:30Z")
  private Timestamp createdAt;
  @Schema(description = "Audit Field - Updated Timestamp", example = "2020-06-15T12:30:30Z")
  private Timestamp updatedAt;
}
