package database1;
import java.util.List;
public class TravelService {
	
	private List<Flight> flights;
	private List<Hotel1> hotels;
	private List<Transpoortation> transportations;
	
	public TravelService() {
		
	}
	public List<Flight> searchFlights(String departure,String arrival,String date){
		return flights;
		
	}
	public List<Hotel1> searchHotels(String location){
		return hotels;
		
	}
	public List<Transpoortation> getTranspoortationOptions(String location){
		return transportations;
		
	}

	
	public Booking createBooking(String userId,Flight flight,Hotel1 hotel,Transpoortation transportation) {
		return null;
		
	}

}

	


