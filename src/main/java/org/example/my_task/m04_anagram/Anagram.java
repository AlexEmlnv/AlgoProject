package org.example.my_task.m04_anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    // Здесь временная сложность алгоритма в худшем O(n) ???
    public int isAnagram(String str1, String str2) {
        if (str1.equals(str2) || str1.length() != str2.length() ) return 0;
        Map<Character, Integer> map1 = convertToMap(str1.toCharArray());
        Map<Character, Integer> map2 = convertToMap(str2.toCharArray());
        return  map1.equals(map2) ? 1 : 0;
    }
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
}
