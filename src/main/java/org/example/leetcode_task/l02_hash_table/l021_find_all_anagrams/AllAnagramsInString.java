package org.example.leetcode_task.l02_hash_table.l021_find_all_anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramsInString {
    private Map<Character, Integer> convertToMap (char[] charArr) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            char keyChar = charArr[i];
            if (map.containsKey(keyChar)) {
                map.put(keyChar, map.get(keyChar) + 1);
            } else {
                map.put(keyChar, 1);
            }
        }
        return map;
    }
    public List<Integer> findAllAnagrams(String origStr, String keyStr) {
        int origLength = origStr.length();
        int keyLength = keyStr.length();
        List<Integer> res = new ArrayList<>();
        if (origStr.isEmpty() ||keyStr.isEmpty() || origLength < keyLength) return res;

        Map<Character, Integer> keyMap = convertToMap(keyStr.toCharArray());

        for (int i = 0; i < origLength - keyLength + 1; i++) {
            String candidate = origStr.substring(i, i + keyLength);
            Map<Character, Integer> candidateMap = convertToMap(candidate.toCharArray());
            if (candidateMap.equals(keyMap)) {
                res.add(i);
            }
        }
        return res;
    }
}
