package com.topgear.fsd;

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
	public Long getEmpCount() {
		return employeeRepository.count();
	}



	@Override
	public List<Employee> getEmpByNameHavingTha() {
		return employeeRepository.findAll(new Specification<Employee>() {
			
			@Override
			public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Path p=root.get("empName");
				Predicate predicate=cb.like(p, "%tha%");
				return predicate;
			}
		});
	}



	@Override
	public List<Employee> getEmpByPermanentType() {
		return employeeRepository.findAll(new Specification<Employee>() {
			
			@Override
			public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Path p=root.get("employeeType");
				Predicate predicate=cb.equal(p, "permanent");
				return predicate;
			}
		});
	}
}
