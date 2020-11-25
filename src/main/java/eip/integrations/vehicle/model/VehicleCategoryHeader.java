package eip.integrations.vehicle.model;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class VehicleCategoryHeader {

  @Schema(description = "Unique Identifier for the Vehicle Category", example = "1")
  private Long id;

  @Schema(description = "Decentralized Identifier for the Vehicle Category", example = "did:agency:1234")
  private String did;

  @Schema(description = "Name in Arabic and English")
  private LanguageMapper name;
}
