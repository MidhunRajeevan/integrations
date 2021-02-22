package eip.integrations.agency.mapping;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import eip.integrations.agency.model.AgencyActivity;
import eip.integrations.agency.model.AgencyDetails;
import eip.integrations.agency.model.AgencyInfo;
import eip.integrations.agency.model.ParentOrganization;
import eip.integrations.agency.model.TradeLicenseDetails;
import eip.integrations.constants.Constants;
import eip.integrations.shared.definition.commertialinstitutedetails.CompanyDetailResponseBodyType;
import eip.integrations.shared.model.Address;
import eip.integrations.shared.model.CodeName;
import eip.integrations.shared.model.Email;
import eip.integrations.shared.model.LanguageMapper;
import eip.integrations.shared.model.PhoneNumberDetail;
import eip.integrations.util.TypeUtil;

@Component
public class TibcoToAgencyMapping {
    
    public AgencyInfo getAgencyReponse(CompanyDetailResponseBodyType companyDetailResponse,String parentTradeLicenseNumber) throws ParseException {
		AgencyInfo agencyInfo = new AgencyInfo();
		TradeLicenseDetails tradeLicense = new TradeLicenseDetails();
		Address address = new Address();
		List<Address> addressList = new ArrayList<Address>();
		PhoneNumberDetail phoneNoDetails = new PhoneNumberDetail();
		List<PhoneNumberDetail> phoneNoList = new ArrayList<>();
		AgencyActivity agencyActivity = new AgencyActivity();
		Email email = new Email();
		List<Email> emailList = new ArrayList<>();
		AgencyDetails agencyDetails = new AgencyDetails();
		ParentOrganization parentOrg = new ParentOrganization();
		LanguageMapper languageMapperActivityName = new LanguageMapper();
		List<AgencyActivity> agencyActivityList = new ArrayList<AgencyActivity>();

		if (companyDetailResponse != null) {
			agencyInfo.setNameAr(Optional.ofNullable(companyDetailResponse.getCompanyNameAR()).orElse(""));
			agencyInfo.setNameEn(Optional.ofNullable(companyDetailResponse.getCompanyName()).orElse(""));
			agencyInfo.setTrafficFileNumber(Optional
					.ofNullable(TypeUtil.bigDecimalToString(companyDetailResponse.getTrafficFileNo())).orElse(""));

			tradeLicense.setLicenseNo(Optional.ofNullable(companyDetailResponse.getTradeLicenseNo()).orElse(""));
			if (companyDetailResponse.getIssuanceDate() != null && !companyDetailResponse.getIssuanceDate().isEmpty())
				tradeLicense.setIssuedDate(TypeUtil.stringToStringWithDate1(companyDetailResponse.getIssuanceDate()));
			if (companyDetailResponse.getExpiryDate() != null && !companyDetailResponse.getExpiryDate().isEmpty())
				tradeLicense.setExpiryDate(TypeUtil.stringToStringWithDate1(companyDetailResponse.getExpiryDate()));
			agencyInfo.setTradeLicense(tradeLicense);
			if (companyDetailResponse.getPoBox() != null || companyDetailResponse.getAddress() != null) {
				address.setPoBox(Optional.ofNullable(companyDetailResponse.getPoBox()).orElse(null));
				LanguageMapper addressLangMapper = new LanguageMapper();
				addressLangMapper.setEn(Optional.ofNullable(companyDetailResponse.getAddress()).orElse(null));
				address.setAddress(addressLangMapper);
				if (companyDetailResponse.getAddress() != null) {
					String[] add = companyDetailResponse.getAddress().split(",");
					CodeName langMapperCity = new CodeName();
					CodeName langMapperArea = new CodeName();
					CodeName langMapperBuilding = new CodeName();
					CodeName langMapperStreet = new CodeName();
					CodeName langMapperEmirates = new CodeName();
					LanguageMapper street = new LanguageMapper();
					LanguageMapper area = new LanguageMapper();
					LanguageMapper city = new LanguageMapper();
					LanguageMapper emirates = new LanguageMapper();
					if (add != null && add.length > 0) {
						if(add.length == 1)
							langMapperBuilding.setCode(add[0]);
						if(add.length == 2)
							street.setEn(add[1]);
						langMapperStreet.setName(street);
						if(add.length == 3)
							area.setEn(add[2]);
						langMapperArea.setName(area);
						if(add.length == 4) {
							city.setEn(add[3]);
							emirates.setEn(add[3]);
						}
						langMapperCity.setName(city);
						langMapperEmirates.setName(emirates);
					}
					address.setBuilding(langMapperBuilding);
					address.setArea(langMapperArea);
					address.setStreet(langMapperStreet);
					address.setCity(langMapperCity);
					address.setEmirate(langMapperEmirates);
				}
				addressList.add(address);
				agencyInfo.setAddress(addressList);
			}

			if (companyDetailResponse.getPhone() != null) {
				String phone =(Optional.ofNullable(companyDetailResponse.getPhone()).orElse(null));
				if(phone!=null && phone.length()>=9)
				{
					phone=phone.replaceAll(Constants.INT_REGEX, "");
					phoneNoDetails.setPhone(phone.substring(phone.length()-7));
					phoneNoDetails.setExtension(phone.substring(phone.length()-9,phone.length()-7));
				}
				else
				{
					phoneNoDetails.setPhone(phone);
				}
				phoneNoList.add(phoneNoDetails);
				agencyInfo.setPhoneNumbers(phoneNoList);
			}

			if (companyDetailResponse.getEmail() != null) {
				email.setEmail(Optional.ofNullable(companyDetailResponse.getEmail()).orElse(null));
				emailList.add(email);
				agencyInfo.setEmail(emailList);
			}

			parentOrg.setRootOrgId(Optional.ofNullable(companyDetailResponse.getRootOrgId()).orElse(""));
			parentOrg.setRootOrgNameA(Optional.ofNullable(companyDetailResponse.getRootOrgNameA()).orElse(""));
			parentOrg.setRootOrgNameE(Optional.ofNullable(companyDetailResponse.getRootOrgNameE()).orElse(""));
			if(parentTradeLicenseNumber!=null)
				parentOrg.setTradeLicenseNumber(parentTradeLicenseNumber);
			agencyDetails.setParentOrganization(parentOrg);
			// agencyInfo.setParentOrganization(parentOrg);

			languageMapperActivityName
					.setAr(Optional.ofNullable(companyDetailResponse.getOrgActivityDescA()).orElse(""));
			languageMapperActivityName
					.setEn(Optional.ofNullable(companyDetailResponse.getOrgActivityDescE()).orElse(""));
			agencyActivity.setName(languageMapperActivityName);
			agencyActivity.setCode(Optional.ofNullable(companyDetailResponse.getOrgActivityCode()).orElse(""));
			agencyActivityList.add(agencyActivity);
			agencyDetails.setActivity(agencyActivityList);

			agencyInfo.setAgencyDetails(agencyDetails);
		}

		return agencyInfo;
	}

}
