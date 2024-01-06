import org.example.leetcode_task.l05_sliding_windows.l051_median.SlidingWindowMaximum;
import org.junit.Assert;
import org.junit.Test;

public class SlidingWindowMaximumTest {
    @Test
    public void testMergeIntervalsSolutionWithMiddleCase () {
        SlidingWindowMaximum solution = new SlidingWindowMaximum();
        int[] actualRes = solution.getMaxInSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        Assert.assertArrayEquals(new int[]{3,3,5,5,6,7}, actualRes);
    }

    @Test
    public void testMergeIntervalsSolutionWithSimpleCase () {
        SlidingWindowMaximum solution = new SlidingWindowMaximum();
        int[] actualRes = solution.getMaxInSlidingWindow(new int[]{1}, 1);
        Assert.assertArrayEquals(new int[]{1}, actualRes);
    }
}
