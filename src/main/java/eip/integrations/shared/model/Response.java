package eip.integrations.shared.model;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Response implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1252844540936267013L;
	@Schema(description = "Response Code",example = "200")
	private int code;
	@Schema(description = "Same as http status ",example = "OK")
	private HttpStatus status;
	@Schema(description = "Description ",example = "SUCCESS")
	private String desc;
}
