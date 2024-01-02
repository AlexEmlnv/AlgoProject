package org.example.leetcode_task.l01_two_pointers.l011_container_with_most_water;

public class ContainerWithMostWater {
    public int calculateMaxWaterInContainer(int[] height) {
        int arrSize = height.length;
        if (arrSize <= 1) return 0;
        int res = 0;
        int curr = 0;
        // 1 цикл по i:бежим по массиву с 0 элемента height.length-1
        // 2 цикл по j: бежим по массиву с i+1 до последнего элемента
        // внутри этих 2 циклов вычисляем произведение mod(h[i]-h[j])*min(h[i],h[j])
        // пузырьком накапливаем макс. произведение
        // Временная сложность О(n*n)
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                curr = Math.abs(i-j)*Math.min(height[i], height[j]);
                res = Math.max(res, curr);
            }
        }
        return  res;
    }
}
