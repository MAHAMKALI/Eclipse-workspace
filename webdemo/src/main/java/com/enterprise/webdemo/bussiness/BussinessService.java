package com.enterprise.webdemo.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enterprise.webdemo.data.DataService;

@Component
public class BussinessService{
	@Autowired
	private DataService dataService;
	
	public long calculatedValue() {
		long sum=0;
		List<Long> arl = dataService.data();
		
		for(Long i:arl) {
			sum += i;
		}
		
		return sum;
	}
}