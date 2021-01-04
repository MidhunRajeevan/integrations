package eip.integrations.agency.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyCommerceRegistry implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3455946980972922L;
	@Schema(description = "Agency Commerce Registry Serial Number", example = "8775")
	private String registerSerialNumber;
	@Schema(description = "UCR Number", example = "21")
	private String ucrNumber;
	@Schema(description = "Agency Commerce Number", example = "40209")
	private String commerceNumber;
	@Schema(description = "Company name", example = "ÔÑßÉ áíÝßæ ÇáÊÌÇÑíÉ (ÐÇÊ  ãÓÆæáíÉ ãÍÏæÏÉ")
	private LanguageMapper companyName;
	@Schema(description = "Agency Main License Number", example = "207765")
	private String mainLicenseNumber;
	@Schema(description = "Agency Commerce Registry Type", example = "Company with Commerce Registry")
	private String commerceRegisterType;
	@Schema(description = "Legal Type", example = "Limited Liability Company(LLC)")
	private String legalType;
	@Schema(description = "Nationality", example = "United Arab Emirates")
	private String nationality;
	@Schema(description = "Issued Date", example = "1991-10-14T00:00:00+04:00")
	private String issueDate;
	@Schema(description = "Expiry Date", example = "2011-01-31T00:00:00+04:00")
	private String expiryDate;
	@Schema(description = "Cancel date", example = "2011-01-31T00:00:00+04:00")
	private String cancelDate;
	@Schema(description = "Paid Up Capital", example = "1300000")
	private String paidUpCapital;
	@Schema(description = "Nominal Capital", example = "1300000")
	private String nominalCapital;
	//private String address;
	
}
