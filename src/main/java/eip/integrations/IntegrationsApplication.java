package eip.integrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;


@SpringBootApplication
public class IntegrationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationsApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		String version = getClass().getPackage().getImplementationVersion();

		return new OpenAPI().addServersItem(new Server().url("https://api.rta.ae/tars"))
				.info(new Info().title("TARS Integration EIP").description("EIP Integration Services for TARS.").version(version)
						.contact(new Contact().url("https://www.rta.ae").name("TARS Relationship Manager")).license(
								new License().name("Roads and Transport Authority. All Rights Reserved").url("https://www.rta.ae")));
	}

}
