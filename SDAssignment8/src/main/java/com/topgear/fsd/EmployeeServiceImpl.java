package com.topgear.fsd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.querydsl.core.types.Predicate;

@RestController
@EnableJpaRepositories(basePackages="com.topgear.fsd")
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void save(Employee emp) { 
		QEmployee employee=QEmployee.employee;
		employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmp() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findEmpById(Long empId) {
		List<Employee> li=new ArrayList<>();
		QEmployee employee=QEmployee.employee;
		Predicate predicate=employee.empId.eq(empId);
		Iterable<Employee> itr=employeeRepository.findAll(predicate);
		for(Employee e:itr) {
			li.add(e);
		}
		return li;
	}

	@Override
	public List<Employee> findEmpByName(String empName) {
		List<Employee> li=new ArrayList<>();
		QEmployee employee=QEmployee.employee; 
		Predicate predicate=employee.empName.eq(empName);
		Iterable<Employee> itr=employeeRepository.findAll(predicate);
		for(Employee e:itr) {
			li.add(e);
		}
		return li;
	} 
}
