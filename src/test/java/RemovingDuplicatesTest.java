import org.example.my_task.m01_stones_jewerly.StonesAndJewelry;
import org.example.my_task.m02_remove_duplicates.RemovingDuplicates;
import org.junit.Assert;
import org.junit.Test;

public class RemovingDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        RemovingDuplicates removingDuplicates = new RemovingDuplicates();
        int[] originalArray = {1,1,23,25,44,44, 100};
        int[] expectedArray = {1,23,25,44,100};
        int[] actualArray = removingDuplicates.removeDuplicates(originalArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
