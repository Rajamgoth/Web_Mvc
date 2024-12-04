package in.ashokit.entity;

import jakarta.persistence.Entity;

@Entity
public class Employee {
	
	private Integer EmpId;
	private String EmpName;
	private double EmpSal;
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSal=" + EmpSal + "]";
	}
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(double empSal) {
		EmpSal = empSal;
	}
	

}
