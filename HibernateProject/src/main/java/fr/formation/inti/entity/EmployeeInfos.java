package fr.formation.inti.entity;

public class EmployeeInfos {
	
	private Integer empId;
	private String firstName;
	private String lastName;
	@Override
	public String toString() {
		return "EmployeeInfos [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public EmployeeInfos() {
		
	}
	
	public EmployeeInfos(Integer empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
