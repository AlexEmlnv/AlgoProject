package org.example.leetcode_task.l03_sort.l031_merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsSolution {
    public int[][] mergeIntervals(int[][] intervals) {
        // sorting by first element in interval
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        // we don't know quantity of new intervals => use List
        List<int[]> res = new ArrayList<>();

        for (int[] interval : intervals) {
            if (res.isEmpty() || interval[0] > res.get(res.size() - 1)[1]) {
                // add current interval without changing
                res.add(interval);
            } else {
                // modify previous interval in res using current interval,
                // because current interval(1st point ) more than last interval(2nd point) in result
                res.get(res.size() - 1)[1] = Math.max(interval[1], res.get(res.size() - 1)[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
