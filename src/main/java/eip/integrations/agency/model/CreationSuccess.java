package eip.integrations.agency.model;

import eip.integrations.shared.model.CreateAndUpdateMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class CreationSuccess {
	
	@Schema(description = "Agency Id", example = "12")
	private int id;
	@Schema(description = "Traffic File Number", example = "23132")
	private String trafficFileNumber;
	private CreateAndUpdateMapper created;
	private CreateAndUpdateMapper updated;
}
