package com.JUnit.Mackito.controller;

import java.util.List;

import org.hibernate.hql.internal.ast.tree.UpdateStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JUnit.Mackito.EmployeeRepository;
import com.JUnit.Mackito.Entity.EmployeeEntity;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/getAllEmps")
	public List<EmployeeEntity> getAllEmpDetails(){
		return employeeRepository.findAll();
	}
	
	
	@GetMapping("/getEmp/{id}")
	public EmployeeEntity getEmpDetails(@PathVariable int id) {
		return employeeRepository.findById(id).get();
	}
	
	@PostMapping("/saveEmp")
	public EmployeeEntity saveEmpDetails(@RequestBody EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}
	
	@PutMapping("/updateEmp")
	public EmployeeEntity updateEmpDetails(@RequestBody EmployeeEntity employeeEntity) {
		EmployeeEntity updatedEmployeeEntity = employeeRepository.findById(employeeEntity.getId()).get();
		updatedEmployeeEntity.setEmpName(employeeEntity.getEmpName());
		updatedEmployeeEntity.setEmpSal(employeeEntity.getEmpSal());
		updatedEmployeeEntity.setExp(employeeEntity.getExp());
		updatedEmployeeEntity.setLoc(employeeEntity.getLoc());
		return employeeRepository.save(updatedEmployeeEntity);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public List<EmployeeEntity> deleteEmpDetails(@PathVariable int id){
		EmployeeEntity deleteEmployeeEntity = employeeRepository.findById(id).get();
		employeeRepository.delete(deleteEmployeeEntity);
		return employeeRepository.findAll();
	}
}
