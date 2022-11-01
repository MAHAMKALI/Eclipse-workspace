package com.explore.Config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer{
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry
                .addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
	
	@Bean
	public Docket postsApi() {

	return new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.explore"))
            .paths(regex("/book.*"))
            .build();

	}
	
	private ApiInfo apiInfo() {

		return new ApiInfoBuilder().title("Course API")

		.description("book Course API Documentation Generateed Using SWAGGER2 for our Course Rest API")

		.termsOfServiceUrl("http:localhost:2020/book/allbooks")

		.license("explore Rest API License")

		.licenseUrl("http:localhost:2020/book/allbooks").version("1.0").build();

		}

}
