package database1;

import java.time.LocalDate;

public class LeaveRequest {
	
	private Employee employee;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean approved;
	
	
	public LeaveRequest(Employee employee, LocalDate startDate, LocalDate endDate, boolean approved) {
		super();
		this.employee = employee;
		this.startDate = startDate;
		this.endDate = endDate;
		this.approved = approved;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public void approve() {
		// TODO Auto-generated method stub
		
	}
	public String getStartDate1() {
		// TODO Auto-generated method stub
		return null;
	}
	public Employee getEmployee1() {
		// TODO Auto-generated method stub
		return null;
	}

}
