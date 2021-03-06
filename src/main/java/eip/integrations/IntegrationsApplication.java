package eip.integrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@ComponentScan({"ae.rta.activematrix","eip.integrations"})
@SpringBootApplication
@Configuration
public class IntegrationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationsApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		String version = getClass().getPackage().getImplementationVersion();

		return new OpenAPI().addServersItem(new Server().url("https://api.rta.ae/tars"))
				.info(new Info().title("Integration EIP").description("EIP Integration Services for TARS.").version(version)
						.contact(new Contact().url("https://www.rta.ae").name("TARS Relationship Manager")).license(
								new License().name("Roads and Transport Authority. All Rights Reserved").url("https://www.rta.ae")));
	}

}
