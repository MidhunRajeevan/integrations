package eip.integrations.shared.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class LanguageMapperWithID implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -806119104926167404L;
	@Schema(description = "Id", example = "1")
    private String id;
    @Schema(description = "Name in English", example = "asdfg")
    private String en;
    @Schema(description = "Name in Arabic", example = "مؤسسات")
    private String ar;
}
