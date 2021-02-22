package eip.integrations.configuration;

import javax.net.ssl.TrustManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

@Configuration
public class WebServiceClientConfiguration {

	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		String[] packageArr = new String[] {"eip.integrations.shared.definition","ae.rta.activematrix.degintegration"};
		marshaller.setPackagesToScan(packageArr);
		return marshaller;
	}

	@Bean
	public WebServiceTemplate webServiceTemplate() {
		final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setMarshaller(jaxb2Marshaller());
		webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
		ClientInterceptor[] interceptors = new ClientInterceptor[] { new LogHttpHeaderClientInterceptor()};
		webServiceTemplate.setInterceptors(interceptors);
		HttpsUrlConnectionMessageSender sender = new HttpsUrlConnectionMessageSender();
		sender.setTrustManagers(new TrustManager[] { new UnTrustworthyTrustManager()});
		webServiceTemplate.setMessageSender(sender);
		return webServiceTemplate;
	}
	
}
