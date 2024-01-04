import org.example.leetcode_task.l02_hash_table.l022_two_sum.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testGetTwoNumbers4SumWithMiddle1Case () {
        TwoSum twoSum = new TwoSum();
        int[] actualRes = twoSum.getTwoNumbers4Sum(new int[]{2,7,11,15}, 9);
        Assert.assertArrayEquals(new int[]{0, 1}, actualRes);
    }

    @Test
    public void testGetTwoNumbers4SumWithMiddle2Case () {
        TwoSum twoSum = new TwoSum();
        int[] actualRes = twoSum.getTwoNumbers4Sum(new int[]{3, 2, 4}, 6);
        Assert.assertArrayEquals(new int[]{1, 2}, actualRes);
    }

    @Test
    public void testGetTwoNumbers4SumWithMiddle3Case () {
        TwoSum twoSum = new TwoSum();
        int[] actualRes = twoSum.getTwoNumbers4Sum(new int[]{3, 3}, 6);
        Assert.assertArrayEquals(new int[]{0, 1}, actualRes);
    }
}
