package org.example.my_task.m01_stones_jewerly;

import java.util.HashMap;
import java.util.Map;

public class StonesAndJewelry {
    public int calculateJewelry(String strJewelry, String strStone) {
        int res = 0;
        Map<Character, Integer> mapStone = new HashMap<>();
        for (int i = 0; i < strJewelry.length(); i++) {
            mapStone.put(strJewelry.charAt(i),1);
        }
        for (int i = 0; i < strStone.length(); i++) {
            char ch = strStone.charAt(i);
            if (mapStone.containsKey(ch)) {
                res++;
            }
        }
        return res;
    }
}
