import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
        Flight flight;
        Plane plane;
        Passenger passenger1;
        Passenger passenger2;
        Passenger passenger3;
        Passenger passenger4;
        Passenger passenger5;
        Passenger passenger6;

        @Before
        public void setUp() {
            flight = new Flight("FR4536", "Vancouver", "YVR", "20:00", PlaneType.BOEING747_100);
            plane = new Plane(PlaneType.BOEING747_100);
            passenger1 = new Passenger("Michael", 3);
            passenger2 = new Passenger("Kasia", 7);
            passenger3 = new Passenger("Bill", 3);
            passenger4 = new Passenger("Sue", 7);
            passenger5 = new Passenger("Dan", 3);
            passenger6 = new Passenger("Mary", 7);
        }

        @Test
        public void flightHasNumber(){
                assertEquals("FR4536", flight.getFlightNumber());
        }

        @Test
        public void flightHasDestination(){
                assertEquals("Vancouver", flight.getDestination());
        }

        @Test
        public void flightHasDestAirport(){
                assertEquals("YVR", flight.getDestAirport());
        }

        @Test
        public void flightHasDeparturetime(){
                assertEquals("20:00", flight.getDepartureTime());
        }

        @Test
        public void flightHasNoPassengers(){
                assertEquals(0, flight.passengerCount());
        }

        @Test
        public void canAddPassenger(){
                flight.allowPassengerCheckIn(passenger1);
                assertEquals(1, flight.passengerCount());
        }

        @Test
        public void cannotAddPassenger(){
                flight.allowPassengerCheckIn(passenger2);
                flight.allowPassengerCheckIn(passenger3);
                flight.allowPassengerCheckIn(passenger4);
                flight.allowPassengerCheckIn(passenger5);
                flight.allowPassengerCheckIn(passenger6);
                assertEquals(4, flight.passengerCount());
        }

}
