package database1;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
public class LeaveManagementApp {

	public static void main(String[] args) {
		LeaveManagementService service=new
				LeaveManagementService();
		Employee emp1=new Employee("1","Pawan",20);
		Employee emp2=new Employee("2","Sumit",15);
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.Request Leave");
			System.out.println("2.Approve Leave");
			System.out.println("3.View Pending Requests");
			System.out.println("4.Exit");
			System.out.println("Choose an option");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				System.out.println("Enter employee ID 1 for Pawan,2 for Sumit");
				String empId = scanner.nextLine();
				Employee employee=empId.equals("1")?
						emp1: emp2;
				System.out.println("Enter start date (YYYY-MM-DD):");
				LocalDate startDate = LocalDate.parse(scanner.nextLine());
				System.out.println("Enter end date (YYYY-MM-DD):");
				LocalDate endDate=LocalDate.parse(scanner.nextLine());
				service.requestLeave(employee, startDate, endDate);
				break;
			case 2:
				List<LeaveRequest> pendingRequests=service.getPendingRequests();
				if (pendingRequests.isEmpty()) {
					System.out.println("No pending requests.");
					break;
				}
				for (int i=0;i<pendingRequests.size();i++) {
					LeaveRequest request=pendingRequests.get(i);
					System.out.println(i+1+"."+request.getEmployee().getName()+"from"+
					request.getStartDate()+"to"+request.getEndDate());
					
				}
				System.out.println("Select request to approve:");
				int requestIndex=scanner.nextInt()-1;
				service.approveLeave(pendingRequests.get(requestIndex));
				break;
			case 3:
				List<LeaveRequest> pending=service.getPendingRequests();
				if
				(pending.isEmpty()) {
					System.out.println("No pending requests.");
				} else {
					for
					(LeaveRequest request: pending) {
						System.out.println(((LeaveRequest) request).getEmployee().getName()+"requested leave from"+
					request.getStartDate()+"to"+request.getStartDate());
					}
				}
				break;
			case 4:
				System.out.println("Exiting...");
				scanner.close();
				return;
				default:
					System.out.println("Invalid option.Please try again.");
			}
		}
		

	}

}
