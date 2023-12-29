package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6, 0, 0, 0, 0};
        int[] numbers2 = new int[]{7,8,9,10};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.arraycopy(numbers2, 0, numbers,6, 4);
        System.out.println(Arrays.toString(numbers));

        Integer[] nums = new Integer[]{123,123};
        System.out.println(Arrays.toString(nums));

        int[][] numbers3 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5}};
        System.out.println(numbers3[2][3]);
    }
}
