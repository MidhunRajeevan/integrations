package eip.integrations.agency.model;

import java.math.BigInteger;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class RequiredNocDetails {
	@Schema(description = "Agency  RequiredNocDetails nocCode", example = "2001")
	private Long nocCode;
	@Schema(description = "Agency  RequiredNocDetails nocId", example = "6419764")
	private String nocId;
	@Schema(description = "Agency  RequiredNocDetails authorityNameAr", example = "طلب موافقة مبدئية من إدارة الرقابة و التفتيش")
	private String authorityNameAr;
	@Schema(description = "Agency  RequiredNocDetails authorityNameEn", example = "Department of Control and Inspection")
	private String authorityNameEn;
	@Schema(description = "Agency  RequiredNocDetails nocStatus", example = "2")
	private BigInteger nocStatus;
	@Schema(description = "Agency  RequiredNocDetails nocStatusAr", example = "منتهي")
	private String nocStatusAr;
	@Schema(description = "Agency  RequiredNocDetails nocStatusEn", example = "Completed")
	private String nocStatusEn;
	@Schema(description = "Agency  RequiredNocDetails nocStatusDate", example = "07-08-2017")
	private String nocStatusDate;

}
