package com.topgear.fsd;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	
	@Id
	private Long empId;
	private String empName;
	@Temporal(value=TemporalType.DATE)
	private Date  empDoj;	
	private Float empTotalSalary;	
	private String employeeType;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}
	public Float getEmpTotalSalary() {
		return empTotalSalary;
	}
	public void setEmpTotalSalary(Float empTotalSalary) {
		this.empTotalSalary = empTotalSalary;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDoj=" + empDoj + ", empTotalSalary="
				+ empTotalSalary + ", employeeType=" + employeeType + "]";
	}	
}
