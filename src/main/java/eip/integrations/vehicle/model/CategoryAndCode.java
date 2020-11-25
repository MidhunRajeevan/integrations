package eip.integrations.vehicle.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class CategoryAndCode  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5198398958212125284L;
	@Schema(description = "Plate CFI Code", example = "Private")
    private String cfiCode;
    @Schema(description = "Plate Code", example = "2")
    private String code;
    @Schema(description = "Plate code/category desciption deatils", example = "")
    private LanguageMapper description;

}
