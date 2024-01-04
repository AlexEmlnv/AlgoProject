import org.example.leetcode_task.l03_sort.l031_merge_intervals.MergeIntervalsSolution;
import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsSolutionTest {
    @Test
    public void testMergeIntervalsSolutionWithMiddle1Case () {
        MergeIntervalsSolution solution = new MergeIntervalsSolution();
        int[][] actualRes = solution.mergeIntervals(new int[][]{{8,10}, {1,3}, {2,6}, {15,18}});
        Assert.assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, actualRes);
    }

    @Test
    public void testMergeIntervalsSolutionWithMiddle2Case () {
        MergeIntervalsSolution solution = new MergeIntervalsSolution();
        int[][] actualRes = solution.mergeIntervals(new int[][]{{4,5}, {1,4}});
        Assert.assertArrayEquals(new int[][]{{1, 5}}, actualRes);
    }
}
