package eip.integrations.shared.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Geolocation {
  @Schema(description = "Latitude", example = "25.1892807")
  private Double latitude;
  @Schema(description = "Longitude", example = "55.2561466")
  private Double longitude;
}
