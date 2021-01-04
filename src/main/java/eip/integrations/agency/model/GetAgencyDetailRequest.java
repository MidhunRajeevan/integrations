package eip.integrations.agency.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


@lombok.Data
public class GetAgencyDetailRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	private long trafficFileNumber;
	@NotNull
	private String tradeLicenseNumber;
}
