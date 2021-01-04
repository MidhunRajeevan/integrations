package eip.integrations.agency.model;

import java.io.Serializable;
import java.util.List;

import eip.integrations.shared.model.Attachment;
import eip.integrations.shared.model.Contact;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class AgencyDetailsFetch implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 8949455357002275762L;

	@Schema(description = "Traffic File Number of the Agency issued by RTA", example = "12345678")
	private String trafficFileNumber;

	@Schema(description = "Trade License issued by DED")
	private TradeLicenseDetails tradeLicense;

	@Schema(description = "Permit issued by RTA")
	private Organization organization;

	@Schema(description = "Agency Activity")
	private AgencyActivity activity;

	@Schema(description = "Permit issued by RTA")
	private Permit permit;

	@Schema(description = "List of Partners in the Agency")
	private List<Partner> partners;

	@Schema(description = "Contacts")
	private Contact contact;

	@Schema(description = "Attachments")
	private List<Attachment> attachments;

}
