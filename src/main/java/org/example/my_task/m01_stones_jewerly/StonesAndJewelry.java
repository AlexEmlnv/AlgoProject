package org.example.my_task.m01_stones_jewerly;

import java.util.HashMap;
import java.util.Map;

public class StonesAndJewelry {
    public int gemStonesCount (String strStone, String strJewel) {
        int res = 0;
        Map<Character, Integer> mapStone = new HashMap<>();
        for (int i = 0; i < strStone.length(); i++) {
            mapStone.put(strStone.charAt(i),1);
        }
        for (int i = 0; i < strJewel.length(); i++) {
            char ch = strJewel.charAt(i);
            if (mapStone.containsKey(ch)) {
                res++;
            }
        }
        return res;
    }
}
