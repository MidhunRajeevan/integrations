package eip.integrations.agency.model;

import java.math.BigInteger;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class MemberModificationList {
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "عميده سفاروفا")
	private String memberNameAr;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "")
	private String memberNameEn;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "شريك")
	private String legalNameAr;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "Partner")
	private String legalNameEn;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "4")
	private BigInteger actionCode;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "خروج شريك")
	private String actionTypeAr;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "remove partner")
	private String actionTypeEn;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "اوزباكستان")
	private String nationalityAr;
	@Schema(description = "Agency  MemberModificationList memberNameAr ", example = "Uzbekistan")
	private String nationalityEn;

}
