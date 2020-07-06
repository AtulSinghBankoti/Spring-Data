package com.topgear.fsd;

import java.util.Date;
import java.util.List;

public interface EmployeeService {
	void save(Employee emp);
	
	void update(Employee emp);
	
	void delete(Long empId);
	
	Employee findById(Long empId);
	
	List<Employee> getEmpByDoj(Date empDoj);
	
	List<Employee> getAllEmp();
	
	List<Employee> empByNameSpec(String empName);
}
