package com.topgear.fsd;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories(basePackages="com.topgear.fsd")
@SpringBootApplication
public class SdAssignment8Application {

	@Autowired
	EmployeeService employeeService;  
	
	@RequestMapping("/all")
	public List<Employee> getAll(){
		return employeeService.getAllEmp();
	}
	
	
	@RequestMapping("/id/{id}")
	public List<Employee> getById(@PathVariable("id")String id){
		return employeeService.findEmpById(Long.parseLong(id));
	}
	
	
	@RequestMapping("/name/{name}")
	public List<Employee> getByName(@PathVariable("name")String name){
		return employeeService.findEmpByName(name);
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public  List<Employee> save(@RequestBody Employee emp){
		employeeService.save(emp);
		return employeeService.findEmpById(emp.getEmpId());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SdAssignment8Application.class, args);
	}
}
