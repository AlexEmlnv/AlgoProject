import org.example.leetcode_task.l09_dfs_bfs.l091_number_of_islands.NumberOfIslands;
import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {
    @Test
    public void testCalculateNumIslandsWithMiddleCase () {
        NumberOfIslands number = new NumberOfIslands();
        char[][] arr = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
        };
        Assert.assertEquals(1, number.calculateNumIslands(arr));
    }

    @Test
    public void testCalculateNumIslandsWithMiddle2Case () {
        NumberOfIslands number = new NumberOfIslands();
        char[][] arr = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','1','0'},
                {'0','0','0','0','1'},
        };
        Assert.assertEquals(3, number.calculateNumIslands(arr));
    }
}
