package com.binde.spring;

public class Employee {
  private Integer empNo;
  private String empName;
  private Float empSal;
public Integer getEmpNo() {
	return empNo;
}
public String getEmpName() {
	return empName;
}
public Float getEmpSal() {
	return empSal;
}
public void setEmpNo(Integer empNo) {
	this.empNo = empNo;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public void setEmpSal(Float empSal) {
	this.empSal = empSal;
}
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
}
  
  

}
