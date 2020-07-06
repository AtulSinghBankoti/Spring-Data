package com.topgear.fsd;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>,JpaSpecificationExecutor<Employee>{
	List<Employee> findByEmpDoj(Date empDoj);
}
