import org.junit.Before;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest{
    Flight flight;
    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747_100);
    }
}


