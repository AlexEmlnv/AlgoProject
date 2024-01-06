package org.example.leetcode_task.l05_sliding_windows.l051_median;

// Time Complexity O(n*n)
public class SlidingWindowMaxBruteForce {
    public int[] getMaxOfSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if ( n == 0 || k == 0) return new int[0];

        int numOfWindows = n - k + 1;
        int[] res = new int[numOfWindows];
        for (int start = 0; start < numOfWindows; start++) {
            int end = start + k -1;
            int maxVal = nums[start];
            // бежим по окошку и вычисляем максимум
            for (int i = start + 1; i <= end; i++) {
                if (nums[i] > maxVal) maxVal = nums[i];
            }
            res[start] = maxVal;
        }
        return res;
    }
}
