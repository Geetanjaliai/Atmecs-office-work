package com.task.odapi;

import com.task.odapi.util.OD_API_CONSTANTS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.*;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
@EnableSwagger2
public class OdapiApplication {

	private static final Logger log = LoggerFactory.getLogger(OD_API_CONSTANTS.LOG_MODULE_NAME.getValue());
	public static void main(String[] args) throws IOException {
		SpringApplication.run(OdapiApplication.class, args);
	}

	/**
	 * Enable SWAGGER 2
	 *
	 * @return {@link Docket}
	 */
	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.task.odapi"))
				.build()
				.apiInfo(apiInfo());
	}

	/**
	 * Setting SWAGGER description for Micro Service
	 *
	 * @return {@link ApiInfo}
	 */
	private ApiInfo apiInfo() {
		Contact ct = new Contact("Web Services Product Engineering", "https://www.jetblue.com", "");
		return new ApiInfoBuilder()
				.title("OD-API")
				.description("Task on OD-API")
				.license("JetBlue Proprietary")
				.termsOfServiceUrl("http://www.jetblue.com")
				.contact(ct)
				.version("1.0.0")
				.build();
	}


}
