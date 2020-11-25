package eip.integrations.shared.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CodeName implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Schema(description = "Code")
  private String code;

  @Schema(description = "Name in Arabic and English")
  private LanguageMapper name;
}
