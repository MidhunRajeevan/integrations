package eip.integrations.agency.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyAttachment {
	
	@Schema(description = "Agency Attachment Type", example = "abc")
	private String attachmentType;
	@Schema(description = "Agency Attachment", example = "abc")
	private String attachment;

}
