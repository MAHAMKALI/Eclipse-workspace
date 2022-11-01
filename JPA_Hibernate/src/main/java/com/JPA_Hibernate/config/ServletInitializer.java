package com.JPA_Hibernate.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.JPA_Hibernate.JpaHibernateApplication;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	  protected Class<?>[] getServletConfigClasses() {
	    return new Class[] { JpaHibernateApplication.class };
	  }

	  @Override
	  protected String[] getServletMappings() {  
	    return new String[] { "/" };
	  }

	  @Override
	  protected Class<?>[] getRootConfigClasses() {
	    return null;
	  }
}
