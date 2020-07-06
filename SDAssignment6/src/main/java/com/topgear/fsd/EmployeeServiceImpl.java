package com.topgear.fsd;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository; 
	
	@Override
	public void save(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public void update(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public void delete(Long empId) {
		employeeRepository.delete(empId);
	}

	@Override
	public Employee findById(Long empId) {
		return employeeRepository.findOne(empId);
	}

	@Override
	public List<Employee> getEmpByDoj(Date empDoj) {
		return employeeRepository.findByEmpDoj(empDoj);
	}

	@Override
	public List<Employee> getAllEmp() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> empByNameSpec(String empName) {
		return employeeRepository.findAll(new Specification<Employee>() {
			
			@Override
			public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Path p=root.get("empName");
				Predicate predicate=cb.equal(p, empName);
				return predicate;
			}
		});
	}

}
