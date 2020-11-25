package eip.integrations.vehicle.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class VehicleRegistration {
  @Schema(description = "Registration Number", example = "12450556")
  private String number;

  @Schema(description = "Registration Date", example = "2020-01-15")
  private String issuedDate;

  @Schema(description = "Registration Expiry Date", example = "2021-01-14")
  private String expiryDate;

  @Schema(description = "Registration Place", example = "DUBAI")
  private String place;
}
