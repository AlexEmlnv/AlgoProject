package org.example.leetcode_task.l02_hash_table.l022_two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] getTwoNumbers4Sum (int[] nums, int targetSum) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int candidate = targetSum - nums[i];
            if (map.containsKey(candidate)) {
                res[0] = map.get(candidate);
                res[1] = i;
                return res;
            } else {
                map.put(nums[i], i);
            }
        }
        return  res;
    }
}
