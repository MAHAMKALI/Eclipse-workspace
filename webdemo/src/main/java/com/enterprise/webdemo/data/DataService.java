package com.enterprise.webdemo.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService{
		
	public List<Long> data(){
	
		return Arrays.asList(20L,20L,30L);
	}
	
}