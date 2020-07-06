package com.topgear.fsd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
public class SdAssignment6Application {

	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Employee save(@RequestBody Employee emp){
		employeeService.save(emp);
		 return employeeService.findById(emp.getEmpId());
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public Employee update(@RequestBody Employee emp){
		employeeService.save(emp);
		return employeeService.findById(emp.getEmpId());
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")String id){
		employeeService.delete(Long.parseLong(id));
	}
	
	@RequestMapping(value="/all")
	public List<Employee> getAll(){
		return employeeService.getAllEmp();
	}
	
	@RequestMapping("/doj/{empDoj}")
	public List<Employee> getByDoj(@PathVariable("empDoj") String empDoj){
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date d=null;
		try {
			d=sdf.parse(empDoj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	 	return employeeService.getEmpByDoj(d);
	}
	
	@RequestMapping("/name/{empName}")
	public List<Employee> getByName(@PathVariable("empName")String empName){
		return employeeService.empByNameSpec(empName);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SdAssignment6Application.class, args);
	}
}
