package org.example.leetcode_task.l01_two_pointers.l011_container_with_most_water;

import org.example.leetcode_task.l01_two_pointers.l011_container_with_most_water.ContainerWithMostWater2;
import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWater2Test {
    @Test
    public void testCalculateMaxWaterInContainerCaseSimple(){
        ContainerWithMostWater2 container2 = new ContainerWithMostWater2();
        int actual = container2.calculateMaxWaterInContainer(new int[]{1, 1});
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCalculateMaxWaterInContainerCaseMiddle(){
        ContainerWithMostWater2 container2 = new ContainerWithMostWater2();
        int actual = container2.calculateMaxWaterInContainer(new int[]{1, 2, 9, 3});
        Assert.assertEquals(4, actual);
    }

    @Test
    public void testCalculateMaxWaterInContainerCaseHard(){
        ContainerWithMostWater2 container2 = new ContainerWithMostWater2();
        int actual = container2.calculateMaxWaterInContainer(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assert.assertEquals(49, actual);
    }
}
