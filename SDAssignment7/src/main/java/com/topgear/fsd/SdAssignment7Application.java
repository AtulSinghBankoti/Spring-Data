package com.topgear.fsd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories(basePackages="com.topgear.fsd")
@SpringBootApplication
public class SdAssignment7Application {

	@Autowired
	EmployeeService employeeService;  
	
	@RequestMapping("/count")
	public Long getEmpCount() {
		return employeeService.getEmpCount();
	}
	
	@RequestMapping("/permanent")
	public List<Employee> getPermanentEmp() {
		return employeeService.getEmpByPermanentType();
	}
	
	@RequestMapping("/tha")
	public List<Employee> getEmpHavingTha() {
		return employeeService.getEmpByNameHavingTha();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SdAssignment7Application.class, args);
	}
}
