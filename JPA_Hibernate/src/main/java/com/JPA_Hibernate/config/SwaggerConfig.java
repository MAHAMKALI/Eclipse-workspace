package com.JPA_Hibernate.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer{
	
	@Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {       
	      
	        System.out.println("[SpringConfig] addResourcehandlers");
	        registry. 
	addResourceHandler("/swagger-ui/**")
	.addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/")
	.resourceChain(false);
	  }

	  @Override
	  public void addViewControllers(ViewControllerRegistry registry) {
	             
	        System.out.println("[SpringConfig] addingViewControllers");
	    registry.addViewController("/swagger-ui/")
	        .setViewName("forward:" + "/swagger-ui/index.html");
	  }
}
