package eip.integrations.agency.model;

import java.io.Serializable;
import java.math.BigInteger;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class AgencyActivityList  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -715082291521620174L;
	@Schema(description = "Activity oldActivityNameAr", example = "abc")
	private String oldActivityNameAr;
	@Schema(description = "Activity oldActivityNameEn", example = "abc")
	private String oldActivityNameEn;
	@Schema(description = "Activity oldActivityCode", example = "abc")
	private String oldActivityCode;
	@Schema(description = "Activity actionCode", example = "abc")
	private BigInteger actionCode;
	@Schema(description = "Activity actionCodeAr", example = "abc")
	private String actionCodeAr;
	@Schema(description = "Activity actionCodeEn", example = "abc")
	private String actionCodeEn;
}
