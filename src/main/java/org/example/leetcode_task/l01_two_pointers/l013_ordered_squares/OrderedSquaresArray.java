package org.example.leetcode_task.l01_two_pointers.l013_ordered_squares;

// time complexity O(n)
// memory complexity O(n)
public class OrderedSquaresArray {
    public int[] makeOrderedSquares (int[] orig) {
        int arrSize = orig.length;
        if (arrSize == 0) return new int[0];

        int left = 0;
        int right = arrSize -1;
        int index = arrSize -1;
        int[] res = new int[arrSize];

        while (left <= right) {  // 0 <= 0
            if (orig[left] * orig[left] <  orig[right] * orig[right]) {
                res[index] = orig[right] * orig[right];
                right--;
            } else {
                res[index] = orig[left] * orig[left];
                left++;
            }
            index--;
        }
        return res;
    }
}
