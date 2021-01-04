package eip.integrations.agency.model;

import java.io.Serializable;

@lombok.Data
public class ParentOrganization implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6358833184433416858L;
	private String rootOrgId;
	private String rootOrgNameA;
	private String rootOrgNameE;
	private String tradeLicenseNumber;

}
