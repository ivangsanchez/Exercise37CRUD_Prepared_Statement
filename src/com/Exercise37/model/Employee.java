package com.Exercise37.model;

public class Employee {
	private int idEmployee;
	private String nameEmployee;
	private int ageEmployee;
	private String addressEmployee;
	private double salaryEmployee;
	private String departmentEmployee;

	//constructor
	public Employee(){
	}
	
	//Constructor parametrizado
	public Employee(int idEmployee, String nameEmployee, int ageEmployee,String addressEmployee,double salaryEmployee, String departmentEmployee) {
		this.idEmployee=idEmployee;
		this.nameEmployee=nameEmployee;
		this.ageEmployee=ageEmployee;
		this.addressEmployee=addressEmployee;
		this.salaryEmployee=salaryEmployee;
		this.departmentEmployee=departmentEmployee;
		
	}
	
	public int getIdEmployee()
	{
		return this.idEmployee;
	}
	
	public void setIdEmployee(int idEmployee) {
		this.idEmployee=idEmployee;
	}
	
	public String getNameEmployee() {
		return this.nameEmployee;
	}
	
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee=nameEmployee;
	}
	
	public int getAgeEmployee()
	{
		return this.ageEmployee;
	}
	
	public void setAgeEmployee(int ageEmployee)
	{
		this.ageEmployee=ageEmployee;
	}
	
	public String getAddressEmployee() {
		return this.addressEmployee;
	}
	
	public void setAddressEmployee(String addressEmployee) {
		this.addressEmployee=addressEmployee;
	}
	
	public double getSalaryEmployee() {
		return this.salaryEmployee;
	}
	
	public void setSalaryEmployee(double salaryEmployee) {
		this.salaryEmployee=salaryEmployee;
	}
	
	public String getDepartmentEmployee() {
		return this.departmentEmployee;
	}
	
	public void setDepartmentEmployee(String departmentEmployee) {
		this.departmentEmployee=departmentEmployee;
	}
	
	
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", nameEmployee=" + nameEmployee + ", ageEmployee=" + ageEmployee
				+ ", addressEmployee=" + addressEmployee + ", salaryEmployee=" + salaryEmployee
				+ ", departmentEmployee=" + departmentEmployee + "]";
	}

	
}
