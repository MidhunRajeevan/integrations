package eip.integrations.agency.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4668348246864240774L;
	private List<AgencyActivity> activity;
	private AgencyCommerceRegistry commerceRegistry;
	private AgencyActivity commerceRegistryActivity;
	private Organization organization;
	private ParentOrganization parentOrganization;
	private List<Partner> partner;
	private Permit permit;
}
