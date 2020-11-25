package eip.integrations.vehicle.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class Registration  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1745857401907498550L;
	@Schema(description = "Registration Number", example = "")
	private String number;
	@Schema(description = "Registered Place", example = "")
	private String place;
	@Schema(description = "Registration Expiray Date", example = "2019-01-23T00:00:00.000Z")
	private String expiryDate;
	@Schema(description = "Registered Date", example = "2016-12-31T14:42:08.000Z")
	private String date;
	private String remarks;
}
