package com.binde.spring;

public class TestBean implements Test {
    private Employee employee;
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void display() {
	System.out.println(employee.getEmpNo()+" "+employee.getEmpName()+" "+employee.getEmpSal());	
	}
}
