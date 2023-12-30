package org.example.my_task.m03_consec_units;

public class ConsecutiveUnits {
    public int getMaxSeriesFrom1 (int[] originalArray) {
        // Здесь временная сложность алгоритма в худшем O(n)
        int res = 0;
        int localRes = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if ( originalArray[i] == 1 ) {
                localRes++;
            } else {
                if (localRes > res) {
                    res = localRes;
                    localRes = 0;
                }
            }
        }
        return (localRes > res ? localRes : res);
    }
}
