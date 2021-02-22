package eip.integrations.configuration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapEnvelope;
import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.SoapFaultDetailElement;
import org.springframework.ws.soap.SoapMessage;

@Component
public class LogHttpHeaderClientInterceptor implements ClientInterceptor {
	
	private static final Logger LOG = LogManager.getLogger(LogHttpHeaderClientInterceptor.class);
		
	  @Override
	  public void afterCompletion(MessageContext arg0, Exception arg1)
	      throws WebServiceClientException {
	  }
	  @Override
	  public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
			
			LOG.info("Message Context on soap Fault  " + messageContext);
			if (messageContext != null) {
				LOG.info("intercepted a fault...");
				SoapBody soapBody = getSoapBody(messageContext);
				SoapFault soapFault = soapBody.getFault();
				LOG.info("Fault string " + String.format(soapFault.getFaultStringOrReason()));
				LOG.info("Fault actor/role  " + String.format(soapFault.getFaultActorOrRole()));
				LOG.info("Fault code prefix " + soapFault.getFaultCode().getPrefix() + "  " +String.format(soapFault.getFaultCode().getPrefix()));
				LOG.info("Fault code localpart " + soapFault.getFaultCode().getLocalPart() +"   "+String.format(soapFault.getFaultCode().getLocalPart()));
				SoapFaultDetail soapFaultDetails = soapFault.getFaultDetail();
				LOG.info("Fault source  " + soapFaultDetails.getSource().getSystemId());
				LOG.info("Fault name  " + soapFaultDetails.getName().getLocalPart() + "  prefix  "+soapFaultDetails.getName().getPrefix());
				LOG.info("Fault result  " + soapFaultDetails.getResult().getSystemId());
			
				/*
				 * Iterator<QName> qNames = soapFaultDetails.getAllAttributes(); List<QName>
				 * list = new ArrayList<>(); qNames.forEachRemaining(list::add); while
				 * (qNames.hasNext()) { LOG.info("Qname - " + qNames.next().getLocalPart() +
				 * "   "+ qNames.next().getPrefix()); } Iterator<SoapFaultDetailElement>
				 * detailEntries = soapFaultDetails.getDetailEntries(); while
				 * (detailEntries.hasNext()) { for(QName qn: list) { LOG.info("detailEntries - "
				 * + detailEntries.next()); LOG.info("detailEntries - " +
				 * detailEntries.next().getAttributeValue(qn)); } }
				 */

			}
		  
	    return true;
	  }
	  @Override
	  public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		  HttpLoggingUtils.logMessage("Server Request Message", messageContext.getRequest());
	    return true;
	  }
	  @Override
	  public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		  HttpLoggingUtils.logMessage("Server Response Message", messageContext.getResponse());
	    return true;
	  }
	  
	  private SoapBody getSoapBody(MessageContext messageContext) {
		SoapMessage soapMessage = (SoapMessage) messageContext.getResponse();
		SoapEnvelope soapEnvelope = soapMessage.getEnvelope();
		return soapEnvelope.getBody();
	  }

}
