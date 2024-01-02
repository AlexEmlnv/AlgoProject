package org.example.leetcode_task.l01_two_pointers.l011_container_with_most_water;

public class ContainerWithMostWater2 {
    public int calculateMaxWaterInContainer(int[] height) {
        int arrSize = height.length;
        if (arrSize <= 1) return 0;
        int pointerOne = 0;
        int pointerTwo = arrSize - 1;
        int res = 0;

        while (pointerOne < pointerTwo) {
            int curr = Math.abs(pointerOne-pointerTwo)
                    *Math.min(height[pointerOne], height[pointerTwo]);

            if (curr > res) {
                res = curr;
            }
            if (height[pointerOne] < height[pointerTwo]) {
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }
        return res;
    }
}
