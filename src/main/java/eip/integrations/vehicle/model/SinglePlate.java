package eip.integrations.vehicle.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class SinglePlate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1404914558581801761L;
	@Schema(description = "Plate Number",example = "1234")
	private String number;
	@Schema(description = "Plate Source",example = "DXB")
	private String source;
	@Schema(description = "Plate Category",example = "Private")
	private String category;
	@Schema(description = "Plate Code",example = "T")
	private String code;
}
