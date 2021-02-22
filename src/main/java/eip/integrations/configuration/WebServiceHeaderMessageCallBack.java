package eip.integrations.configuration;

import java.io.IOException;
import java.util.Date;

import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.TransformerException;


import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import eip.integrations.util.TypeUtil;

public class WebServiceHeaderMessageCallBack implements WebServiceMessageCallback {

	private String username;
	private String password;
	private String nonce;
	private Date created;

	public WebServiceHeaderMessageCallBack(String username, String password, String nonce, Date created) {
		super();
		this.username = username;
		this.password = password;
		this.nonce = nonce;
		this.created = created;
	}

	@Override
	public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
		try {

			SaajSoapMessage saajSoapMessage = (SaajSoapMessage) message;
			SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
			SOAPPart soapPart = soapMessage.getSOAPPart();
			SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
			SOAPHeader soapHeader = soapEnvelope.getHeader();
			Name headerElementName = soapEnvelope.createName("Security", "wsse",
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
			SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(headerElementName);
			SOAPElement usernameTokenSOAPElement = soapHeaderElement.addChildElement("UsernameToken", "wsse");
			SOAPElement userNameSOAPElement = usernameTokenSOAPElement.addChildElement("Username", "wsse");
			userNameSOAPElement.addTextNode(this.username);
			SOAPElement passwordSOAPElement = usernameTokenSOAPElement.addChildElement("Password", "wsse");
			passwordSOAPElement.addTextNode(this.password);
			SOAPElement nonceSOAPElement = usernameTokenSOAPElement.addChildElement("Nonce", "wsse");
			nonceSOAPElement.addTextNode(this.nonce);
			SOAPElement createdSOAPElement = usernameTokenSOAPElement.addChildElement("Created", "wsse");
			createdSOAPElement.addTextNode(TypeUtil.datetoString(this.created));
			soapMessage.saveChanges();
		} catch (SOAPException soapException) {
			throw new RuntimeException("TokenHeaderRequestCallback", soapException);
		}
	}
}
