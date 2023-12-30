import org.example.my_task.m03_consec_units.ConsecutiveUnits;
import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveUnitsTest {
    @Test
    public void testGetMaxSeriesFrom1(){
        ConsecutiveUnits consecutiveUnits = new ConsecutiveUnits();
        int[] originalArray = {1,1,0,0,1,1,1,0,0,1};
        int actualRes = consecutiveUnits.getMaxSeriesFrom1(originalArray);
        Assert.assertEquals(3, actualRes);
    }
}
