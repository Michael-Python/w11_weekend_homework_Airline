import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String destAirport;
    private String departureTime;
    private PlaneType planeType;
    private ArrayList<Passenger> booked;

    public Flight(String flightNumber, String destination, String destAirport, String departureTime, PlaneType planeType){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.destAirport = destAirport;
        this.departureTime = departureTime;
        this.planeType = planeType;
        this.booked = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDestAirport() {
        return this.destAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

}
