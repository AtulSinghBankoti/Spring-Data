package com.topgear.fsd;

import java.util.List;

public interface EmployeeService {
	
	void save(Employee emp);
	
	List<Employee> getAllEmp();
	
	List<Employee> findEmpById(Long empId);
	
	List<Employee> findEmpByName(String empName);
}
