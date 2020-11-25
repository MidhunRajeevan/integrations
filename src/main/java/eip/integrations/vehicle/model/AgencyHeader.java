package eip.integrations.vehicle.model;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AgencyHeader {
  @Schema(description = "Unique Identifier for the Agency", example = "1")
  private Long id;

  @Schema(description = "Decentralized Identifier for the Agency", example = "did:eid:784199952698752")
  private String did;

  @Schema(description = "Source for the Decentralized ID", example = "eid")
  private String source;

  @Schema(description = "Natural Key from the Source", example = "784199952698752")
  private String sourceKey;

  @Schema(description = "Hash of all trackable attributes", example = "2fdc0177057d3a5c6c2c0821e01f4fa8d90f9a3bb7afd82b0db526af98d68de8")
  private String versionHash;

  @Schema(description = "Name in Arabic and English")
  private LanguageMapper name;
}
