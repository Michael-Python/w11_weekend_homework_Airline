import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Michael", 3, 80.0);
        passenger2 = new Passenger("Kasia", 7, 80.0);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Michael", passenger1.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(7, passenger2.getBagNumber());
    }
}
