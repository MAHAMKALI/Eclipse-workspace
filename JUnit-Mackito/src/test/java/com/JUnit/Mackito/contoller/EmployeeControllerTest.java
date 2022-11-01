package com.JUnit.Mackito.contoller;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Expression;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.JUnit.Mackito.EmployeeRepository;
import com.JUnit.Mackito.Entity.EmployeeEntity;
import com.JUnit.Mackito.controller.EmployeeController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;



@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
	
	
	private MockMvc mockMvc;
	
	ObjectMapper objectMapper = new ObjectMapper();
	ObjectWriter objectWriter = objectMapper.writer();
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeController employeeController;
	
	EmployeeEntity e1 = new EmployeeEntity(1,"kishore",2400,"chennai",4);
	EmployeeEntity e2 = new EmployeeEntity(2,"ramya",5100,"banglore",8);
	EmployeeEntity e3 = new EmployeeEntity(1,"prakash",6300,"hyderabad",1);
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
	}
	
	@Test
	public void getAllEmpDetails_Success() {
		List<EmployeeEntity> emps = new ArrayList<EmployeeEntity>(Arrays.asList(e1,e2,e3));
		
		Mockito.when(employeeRepository.findAll()).thenReturn(emps);
		
		mockMvc.perform(
				
				MockMvcRequestBuilders.get("/getAllEmps")
									  .contentType(MediaType.APPLICATION_JSON)
									  .andExpect(status().isOk())
									  .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(3)))
									  .andExpect()
									  
				
				
				);
				
				
				
	}
	
}
