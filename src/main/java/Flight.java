import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private String plane;
    private String flightNumber;
    private String destination;
    private String destAirport;
    private String departureTime;

    public Flight(String flightNumber, String destination, String destAirport, String departureTime){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.destAirport = destAirport;
        this.departureTime = departureTime;
    }

    public Object getFlightNumber() {
        return this.flightNumber;
    }
}
