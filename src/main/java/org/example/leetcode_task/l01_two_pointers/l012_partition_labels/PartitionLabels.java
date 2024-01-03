package org.example.leetcode_task.l01_two_pointers.l012_partition_labels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public List<Integer> splitIntoParts (String s) {
        // Time complexity BigO(2*n)==BigO(n)
        // Get map for max index of characters
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        // two pointers for chunk
        int startPointer = -1;
        int finishPointer = 0;

        // Main algorithm
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            finishPointer = Math.max(finishPointer, map.get(ch));
            if(finishPointer == i){
                // partition time
                res.add(finishPointer - startPointer);
                startPointer = finishPointer;
            }
        }
        return res;
    }
}
