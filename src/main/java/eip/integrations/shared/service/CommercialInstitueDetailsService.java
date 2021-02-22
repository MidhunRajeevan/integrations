package eip.integrations.shared.service;

import java.util.Date;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import eip.integrations.configuration.WebServiceHeaderMessageCallBack;
import eip.integrations.shared.definition.commertialinstitutedetails.GetCommercialInstituteDetailsRequestType;
import eip.integrations.shared.definition.commertialinstitutedetails.GetCommercialInstituteDetailsResponseType;
import eip.integrations.shared.definition.commertialinstitutedetails.ObjectFactory;

@Service
@PropertySource(value = "classpath:services.properties")
public class CommercialInstitueDetailsService {
	
    @Autowired
	private WebServiceTemplate webServiceTemplate;

	@Value("${urlCommercialInstituteDetailsService}")
	private String urlCommercialInstituteDetailsService;

	@Value("${tars.eip.username}")
	private String eipUserName;

	@Value("${tars.eip.password}")
	private String eipPassword;


	public GetCommercialInstituteDetailsResponseType getCommericalInstitueDetails(
			GetCommercialInstituteDetailsRequestType getCommercialInstituteDetailsRequestType) {
 			ObjectFactory objectFactory = new ObjectFactory();
		GetCommercialInstituteDetailsResponseType getCommercialInstituteDetailsResponseType = new GetCommercialInstituteDetailsResponseType();
		JAXBElement<GetCommercialInstituteDetailsRequestType> data = objectFactory
				.createGetCommercialInstituteDetailsRequest(getCommercialInstituteDetailsRequestType);
		webServiceTemplate.setDefaultUri(urlCommercialInstituteDetailsService);
		WebServiceHeaderMessageCallBack headerCallback = new WebServiceHeaderMessageCallBack(eipUserName, eipPassword, "", new Date());
		@SuppressWarnings("unchecked")
		JAXBElement<GetCommercialInstituteDetailsResponseType> instituteDetails = (JAXBElement<GetCommercialInstituteDetailsResponseType>) webServiceTemplate.marshalSendAndReceive(data, headerCallback);

		getCommercialInstituteDetailsResponseType = instituteDetails.getValue();
		return getCommercialInstituteDetailsResponseType;
	}
}
