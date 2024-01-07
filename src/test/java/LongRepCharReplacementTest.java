import org.example.leetcode_task.l05_sliding_windows.l052_longest_replacement.LongRepCharReplacement;
import org.junit.Assert;
import org.junit.Test;

public class LongRepCharReplacementTest {
    @Test
    public void testReplaceChar4LongestRepeatWithSimpleCase () {
        LongRepCharReplacement solution = new LongRepCharReplacement();
        Assert.assertEquals(4, solution.replaceChar4LongestRepeat("ABAB", 2));
    }

    @Test
    public void testReplaceChar4LongestRepeatWithMiddleCase () {
        LongRepCharReplacement solution = new LongRepCharReplacement();
        Assert.assertEquals(4, solution.replaceChar4LongestRepeat("AABABBA", 1));
    }
}
