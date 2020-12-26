package com.example.demo.config.swagger;

import java.util.Collections;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

ServletContext context;
	
	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	            .select()
	            .apis(RequestHandlerSelectors.basePackage("com.example.demo.service"))
	            .paths(PathSelectors.ant("/**"))
	            .build()
	            .pathProvider(new RelativePathProvider(context) {
	            	@Override
	                public String getApplicationBasePath() {
	                    return "/api";
	                }
	            })
	            .apiInfo(info());
	}
	
	private ApiInfo info() {
		return new ApiInfo("Api Rest de Examples"
				,"Api maintane"
				,"v1"
				,"Terms Of Service Url"
				, new Contact("RodMatheus", "com.example.demo", "rodmatheus96@gmail.com")
				,"License of API", "License of URL", Collections.emptyList());
	}
}
