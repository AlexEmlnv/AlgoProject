package org.example.my_task.m01_stones_jewerly;

import java.util.Scanner;

public class StonesAndJewerlyApp {
    public static void main(String[] args) {
        // ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stones string:");
        String stones = scanner.nextLine();
        System.out.println("Enter jewels string:");
        String jewels = scanner.nextLine();

        // бежим по драгоценностям и смотрим не камешек ли это?
        int res = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if ( stones.indexOf(ch) >= 0 ) {
                res++;
            }
        }

        // вывод результата
        System.out.println("Was found jewelry stones: " + res);
        scanner.close();
    }
}
