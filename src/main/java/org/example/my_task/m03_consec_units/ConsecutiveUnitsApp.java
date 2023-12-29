package org.example.my_task.m03_consec_units;

import java.util.Scanner;

public class ConsecutiveUnitsApp {
    public static void main(String[] args) {
        // ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vector size:");
        int size = scanner.nextInt();
        System.out.println("Enter " + size+ "-coordinate vector from 1 or 0 on line:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // бежим по вектору
        int res = 0;
        int localRes = 0;
        for (int i = 0; i < size; i++) {
            if ( array[i] == 1 ) {
                localRes++;
            } else {
                if (localRes > res) {
                    res = localRes;
                    localRes = 0;
                }
            }
        }

        // вывод результата
        System.out.println("Maximum series of units: " + (localRes > res ? localRes : res));
        scanner.close();
    }
}
