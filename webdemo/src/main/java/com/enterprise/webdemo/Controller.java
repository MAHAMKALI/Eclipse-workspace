package com.enterprise.webdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.webdemo.bussiness.BussinessService;

@RestController
public class Controller {
	
	@Autowired
	private BussinessService bussinessService;
	
	@GetMapping("/api/value")
	public long pivalue() {
		return bussinessService.calculatedValue();
	}
}



