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
    private int newCapacity;

    public Flight(String flightNumber, String destination, String destAirport, String departureTime, PlaneType planeType){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.destAirport = destAirport;
        this.departureTime = departureTime;
        this.planeType = planeType;
        this.booked = new ArrayList<Passenger>();
        this.newCapacity = newCapacity;
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


    public int passengerCount() {
        return this.booked.size();
    }

    public void passengerCheckIn(Passenger passenger){
        this.booked.add(passenger);
    }

    public void allowPassengerCheckIn(Passenger passenger) {
        if(passengerCount() < PlaneType.BOEING747_100.getCapacity()) {
            this.passengerCheckIn(passenger);
            passenger.getPassengerNameByNumber();
//            make a method in planetype enum
//            PlaneType.BOEING747_100.capacity --;
            newCapacity = PlaneType.BOEING747_100.getCapacity() - passengerCount();
            System.out.println("On flight "+this.flightNumber+", capacity is now "+ newCapacity);
        } else {
            System.out.println(passenger.getName() + " was not checked in.");
            this.booked.size();
        }
    }
}
