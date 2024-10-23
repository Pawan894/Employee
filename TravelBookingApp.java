package database1;
import java.util.List;
import java.util.Scanner;
public class TravelBookingApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TravelService travelService = new TravelService();
		
		System.out.println("Search Flights:");
		String departure=scanner.nextLine();
		String arrival=scanner.nextLine();
		String date=scanner.nextLine();
		
		List<Flight> availableFlights=travelService.searchFlights(departure, arrival, date);
		

	}

}
