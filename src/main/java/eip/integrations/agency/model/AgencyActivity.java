package eip.integrations.agency.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyActivity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7975778406676565721L;
	private LanguageMapper name;
	@Schema(description = "Activity Code", example = "25")
	private String code;
	private String status;
	@Schema(description = "Add Date", example = "2020-10-01")
	private String effectiveStartDate;
	@Schema(description = "Cancel Date", example = "2020-10-01")
	private String effectiveEndDate;
}
