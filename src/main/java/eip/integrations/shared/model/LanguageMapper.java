package eip.integrations.shared.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class LanguageMapper implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8135025017039359170L;
	@Schema(description = "Name in English", example = "zxcvb")
    private String en;
    @Schema(description = "Name in Arabic", example = "مؤسسات")
    private String ar;
}
