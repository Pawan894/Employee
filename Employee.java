package database1;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
public class Employee {
	
	private String id;
	private String name;
	private int leaveBalance;
	
	public Employee(String id2, String name2, int leaveBalance2) {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeaveBalance() {
		return leaveBalance;
	}
	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	public void deductLeave(int daysApproved) {
		// TODO Auto-generated method stub
		
	}

}
