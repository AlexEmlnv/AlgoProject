package org.example.leetcode_task.l05_sliding_windows.l051_median;

import java.util.*;

// Time complexity O(n)
public class SlidingWindowMaximum {
    public int[] getMaxInSlidingWindow(int[] nums, int k) {
        // assume nums is not null
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        int[] result = new int[n - k + 1]; // number of windows
        Deque<Integer> indexDeque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; ++i) {
            // remove indices that are out of bound
            while (indexDeque.size() > 0 && indexDeque.peekFirst() <= i - k) {
                indexDeque.pollFirst();
            }
            // remove indices whose corresponding values are less than nums[i]
            while (indexDeque.size() > 0 && nums[indexDeque.peekLast()] < nums[i]) {
                indexDeque.pollLast();
            }
            // add nums[i]
            indexDeque.offerLast(i);
            // add to result
            if (i >= k - 1) {
                // all time win first element has index wich give max value in sliding window!!
                result[i - k + 1] = nums[indexDeque.peekFirst()];
            }
        }
        return result;
    }
}
