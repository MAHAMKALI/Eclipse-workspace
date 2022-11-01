package com.coupling.TightCoupling.sample.enterprise.flow;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private BussinessService bussinessService;
	@GetMapping("/sum")
	public long displaySum() {
		return bussinessService.getSum();
	}
}

@Component
class BussinessService{
	
	@Autowired
	private DataService dataService;
	public int sum=0;
	List<Integer> data = dataService.retriveData();
	
	for(int i:data) {
		sum+=i;
	}
	public int getSum() {
		return sum;
	}
}
@Component
class DataService{
	
	public List<Integer> retriveData(){
		return Arrays.asList(10,10,10,10,10);
	}
}
}