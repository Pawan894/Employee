package database1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class LeaveManagementService {
	
	private List<LeaveRequest> leaveRequests = new ArrayList<>();
	public void
	requestLeave(Employee employee,LocalDate startDate,LocalDate endDate) {
		int daysRequested = (int) (endDate.toEpochDay()-startDate.toEpochDay())+1;
		if (daysRequested <=employee.getLeaveBalance()) {
			LeaveRequest leaveRequest=new LeaveRequest(employee,startDate,endDate, false);
			
			leaveRequests.add(leaveRequest);
			System.out.println("Leave request submitted");
			
		} else {
			System.out.println("Insufficient leave balance.");
			
		}
		
	}
	public void
	approveLeave(LeaveRequest leaveRequest) {
		leaveRequest.approve();
		int daysApproved=(int) (leaveRequest.getEndDate().toEpochDay()-leaveRequest.getStartDate().toEpochDay())+1;
		leaveRequest.getEmployee().deductLeave(daysApproved);
		System.out.println("Leave approved for"+leaveRequest.getEmployee().getName());
	}
	public List<LeaveRequest> getPendingRequests(){
		List<LeaveRequest> pending = new ArrayList<>();
		for (LeaveRequest request: leaveRequests) {
			if (!request.isApproved()) {
				pending.add(request);
			}
		}
		return pending;
	}

}
