package eip.integrations.shared.model;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Attachment {
	
	  @Schema(description = "Attachment Label", example = "passport")
	  private String label;

	  @Schema(description = "Attachment Reference UID", example = "did:in:2232124123")
	  private String reference;

	  @Schema(description = "Attachment URL", example = "/attachments/582342345")
	  private String url;
	  
	  private String hash;

}
