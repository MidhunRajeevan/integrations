package eip.integrations.vehicle.model;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Plate {
  @Schema(description = "Plate Category")
  private LanguageMapper category;

  @Schema(description = "Plate Source")
  private LanguageMapper source;

  @Schema(description = "Plate Code")
  private LanguageMapper code;

  @Schema(description = "Plate Number")
  private String number;

  @Schema(description = "Plate Status")
  private String status;
}
