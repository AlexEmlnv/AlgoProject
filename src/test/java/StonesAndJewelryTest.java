import org.example.my_task.m01_stones_jewerly.StonesAndJewelry;
import org.junit.Assert;
import org.junit.Test;

public class StonesAndJewelryTest {
    @Test
    public void testGemStonesCount() {
        StonesAndJewelry stonesAndJewelry = new StonesAndJewelry();
        int n = stonesAndJewelry.calculateJewelry("ab","aadddfffbbhhaa");
        Assert.assertEquals(6, n);
    }
}
