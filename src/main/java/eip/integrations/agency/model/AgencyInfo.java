package eip.integrations.agency.model;

import java.io.Serializable;
import java.util.List;

import eip.integrations.shared.model.Address;
import eip.integrations.shared.model.CreateAndUpdateMapper;
import eip.integrations.shared.model.Email;
import eip.integrations.shared.model.LanguageMapper;
import eip.integrations.shared.model.PhoneNumberDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8361843318417480757L;
	@Schema(description = "Agency Id in Tars", example = "1")
	private int id;	
	@Schema(description = "Agency Name in English", example = "Rent-A-Car, Jebel Ali 1")
	private String nameEn;
	@Schema(description = "Agency Name in Arabic", example = "لتأجير السيارات ، جبل علي 1")
	private String nameAr;
	@Schema(description = "Chain Name", example = "Rent-A-Car\",  - not From TIBCO -")
	private LanguageMapper chainName;
	@Schema(description = "Traffic File Number", example = "2323")
	private String trafficFileNumber;
	private TradeLicenseDetails tradeLicense;
	private List<PhoneNumberDetail> phoneNumbers;
	private List<Email> email;
	private List<Address> address;
	//private Inspections inspections;
	private CreateAndUpdateMapper created;
	private CreateAndUpdateMapper updated;
	@Schema(description = "Agency Status", example = "Active")
	private String status;
	private String versionHash;
	private AgencyDetails agencyDetails;
	private boolean isActive;
	private boolean isArchived;

}
