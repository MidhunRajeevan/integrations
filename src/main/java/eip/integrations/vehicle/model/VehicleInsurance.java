package eip.integrations.vehicle.model;

import eip.integrations.shared.model.CodeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class VehicleInsurance {

  @Schema(description = "Insurance Company")
  private CodeName company;

  @Schema(description = "Policy Type", example = "COMPREHENSIVE")
  private CodeName policyType;

  @Schema(description = "Policy Number", example = "2020/0928291/2921/1")
  private String policyNumber;

  @Schema(description = "Policy Start Date", example = "2020-01-15")
  private String startDate;

  @Schema(description = "Policy Expiry Date", example = "2021-02-14")
  private String expiryDate;
}
