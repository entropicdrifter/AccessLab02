package barth.nolan.AccessLab02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Nolan Barth on 1/25/16.
 */
public class SpecWax {
    @Test
    public void getWaxTypeTest(){
        Wax test = new Wax();
        test.setWaxType("Red");
        assertTrue("Getter should retrieve setting", test.getWaxType() == "Red");
    }
    @Test
    public void getSnowCondTest(){
        Wax test2 = new Wax();
        test2.setSnowCond("Standard");
        assertTrue("Getter should retrieve setting", test2.getSnowCond() == "Standard");
    }
}
