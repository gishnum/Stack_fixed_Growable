package day7.com.app.core;

public class Employee {

	private String EmpId,EmpName;
	
	public Employee(String empid,String empname){
		
		EmpId = empid;
		EmpName = empname;
	}
	
	@Override
	public String toString() {
		
		return "EMPID:: "+EmpId+"EmpName:: "+EmpName;
	}
	
	
	
}
