package org.example.leetcode_task.l05_sliding_windows.l052_longest_replacement;

// Time Complexity :  O(n)
// Space Complexity : O(1)
public class LongRepCharReplacement {
    public int replaceChar4LongestRepeat(String s, int k) {
        // Make an array of size 26 (there are so many letters in the Latin alphabet)
        // HashMap for letters(key) and its quantity(value) in sliding window
        int[] arr = new int[26];
        // largestCount - max count one letter in sliding window
        // maxLength - potential result
        // beg - start of sliding window, end - finish of sliding window
        int largestCount = 0, beg = 0, maxLength = 0;
        for(int end = 0; end < s.length(); end ++){
            // add to hashMap new quantity
            arr[s.charAt(end) - 'A']++;
            // Get the largest count of a single, unique character in the current window after add new letter.
            largestCount = Math.max(largestCount, arr[s.charAt(end) - 'A']);
            // We are allowed to have at most k replacements in the window
            // So, if max character frequency + distance between beg and end is greater than k
            // this means we have considered changing more than k characters. So time to shrink window
            // Then there are more characters in the window than we can replace, and we need to shrink the window
            // Check if wee need left start of sliding window
            // end - beg + 1 - length of the current sliding window
            if(end - beg + 1 - largestCount > k){
                arr[s.charAt(beg) - 'A']--;
                beg ++;
            }
            // Get the maximum length of repeating character...
            maxLength = Math.max(maxLength, end - beg + 1);
        }
        return maxLength;
    }
}
