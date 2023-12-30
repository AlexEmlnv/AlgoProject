package org.example.my_task.m02_remove_duplicates;

import java.util.Set;
import java.util.TreeSet;

public class RemovingDuplicates {
    public int[] removeDuplicates(int[] original) {
        // Здесь временная сложность алгоритма в худшем O(n)
        Set<Integer> resSet= new TreeSet<>();
        for (int i = 0; i < original.length; i++) {
            resSet.add(original[i]);
        }
        return resSet.stream().mapToInt(Number::intValue).toArray();
    }
}
