import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import static org.junit.Assert.assertEquals;

public class FlightTest {
        Flight flight;
        Plane plane;

        @Before
        public void setUp() {
            flight = new Flight("FR4536", "Vancouver", "YVR", "20:00", PlaneType.BOEING747_100);
            plane = new Plane(PlaneType.BOEING747_100);
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



}
