package com.topgear.fsd;

import java.util.List;

public interface EmployeeService {
	
	Long getEmpCount();
	
	List<Employee> getEmpByNameHavingTha();
	
	List<Employee> getEmpByPermanentType();
}
