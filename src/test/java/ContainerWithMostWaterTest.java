import org.example.leetcode_task.l01_two_pointers.l011_container_with_most_water.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {
    @Test
    public void testCalculateMaxWaterInContainerCaseHard(){
        ContainerWithMostWater container = new ContainerWithMostWater();
        int actual = container.calculateMaxWaterInContainer(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assert.assertEquals(49, actual);
    }

    @Test
    public void testCalculateMaxWaterInContainerCaseSimple(){
        ContainerWithMostWater container = new ContainerWithMostWater();
        int actual = container.calculateMaxWaterInContainer(new int[]{1, 1});
        Assert.assertEquals(1, actual);
    }
}
