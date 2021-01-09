import org.junit.Before;

import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class PlaneTest{
    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747_100);
    }

}


