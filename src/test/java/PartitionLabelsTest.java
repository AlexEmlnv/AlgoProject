import org.example.leetcode_task.l01_two_pointers.l012_partition_labels.PartitionLabels;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PartitionLabelsTest {
    @Test
    public void testSplitIntoPartsHardCase() {
        PartitionLabels partitionLabels = new PartitionLabels();
        List<Integer> actual = partitionLabels.splitIntoParts("ababcbacadefegdehijhklij");
        Assert.assertEquals(Arrays.asList(9, 7, 8), actual);
    }

    @Test
    public void testSplitIntoPartsMiddleCase() {
        PartitionLabels partitionLabels = new PartitionLabels();
        List<Integer> actual = partitionLabels.splitIntoParts("eccbbbbdec");
        Assert.assertEquals(Arrays.asList(10), actual);
    }

    @Test
    public void testSplitIntoPartsEmptyCase() {
        PartitionLabels partitionLabels = new PartitionLabels();
        List<Integer> actual = partitionLabels.splitIntoParts("");
        Assert.assertEquals(Arrays.asList(), actual);
    }
}
