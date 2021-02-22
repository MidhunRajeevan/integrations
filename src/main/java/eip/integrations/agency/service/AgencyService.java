package eip.integrations.agency.service;

import java.math.BigDecimal;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eip.integrations.agency.mapping.TibcoToAgencyMapping;
import eip.integrations.agency.model.AgencyInfo;
import eip.integrations.constants.Constants;
import eip.integrations.exception.CustomException;
import eip.integrations.shared.definition.commertialinstitutedetails.CompanyDetailResponseBodyType;
import eip.integrations.shared.definition.commertialinstitutedetails.CompanyDetailResponseType;
import eip.integrations.shared.definition.commertialinstitutedetails.GetCommercialInstituteDetailsRequestType;
import eip.integrations.shared.definition.commertialinstitutedetails.GetCommercialInstituteDetailsResponseType;
import eip.integrations.shared.service.CommercialInstitueDetailsService;

@Service
public class AgencyService {

    @Autowired
    private CommercialInstitueDetailsService commercialInstitueDetailsService;
    
    @Autowired
	private TibcoToAgencyMapping tibcoMapping;
    
    public AgencyInfo getCommericalInstitueDetails(long trafficFilenumber,String tradeLicenseNumber) throws ParseException {
		GetCommercialInstituteDetailsRequestType getCommercialInstituteDetailsRequestType = new GetCommercialInstituteDetailsRequestType();
		AgencyInfo response = new AgencyInfo();
		String Activitycode = "";
		BigDecimal bigDecimalCurrency = new BigDecimal(trafficFilenumber);
		getCommercialInstituteDetailsRequestType.setTrafficNo(bigDecimalCurrency);
		getCommercialInstituteDetailsRequestType.setAppId("TARS");
		GetCommercialInstituteDetailsResponseType getCommercialInstituteDetailsResponseType = commercialInstitueDetailsService.getCommericalInstitueDetails(getCommercialInstituteDetailsRequestType);		
		CompanyDetailResponseType companyResponse =getCommercialInstituteDetailsResponseType.getGetCompanyDetailResponse();
		CompanyDetailResponseBodyType companyDetailResponseBody = new CompanyDetailResponseBodyType();
		for(CompanyDetailResponseBodyType activityResponse:companyResponse.getResponseBody()) {
			if (activityResponse.getOrgActivityCode().equalsIgnoreCase(Constants.AGENCY_ORG_ACTIVITY_CODE)) {
				Activitycode = Constants.AGENCY_ORG_ACTIVITY_CODE;
				companyDetailResponseBody = activityResponse;
				break;
			}
		}
		if (!(Activitycode.equalsIgnoreCase(Constants.AGENCY_ORG_ACTIVITY_CODE))) {
			throw new CustomException(Constants.AGENCY_ACTIVITY_CODE_NOT_FOUND);
		}
		
		if(getCommercialInstituteDetailsResponseType != null && getCommercialInstituteDetailsResponseType.getGetCompanyDetailResponse() != null && getCommercialInstituteDetailsResponseType.getGetCompanyDetailResponse().getResponseBody() != null&& companyDetailResponseBody!= null && getCommercialInstituteDetailsResponseType.getGetCompanyDetailResponse().getResponseBody().size() > 0) {

			response = tibcoMapping.getAgencyReponse(companyDetailResponseBody,null);
		}
	
			
		return response;
	}
}
