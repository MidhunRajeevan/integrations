package eip.integrations.vehicle.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class VehicleHeader {

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

  @Schema(description = "Vehicle Identification Number", example = "1GNCS18Z3M0115561")
  private String vin;

  @Schema(description = "Plate")
  private Plate plate;

}
