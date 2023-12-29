package org.example.easy;

import java.util.*;

public class RemovingDuplicatesApp {
    public static void main(String[] args) {
        Set<Integer> resSet= new TreeSet<>();
        int enteredNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        System.out.println("Enter " + size + " integer numbers:");
        for (int i = 0; i < size; i++) {
            enteredNumber = scanner.nextInt();
            resSet.add(enteredNumber);
        }

        // вывод результата
        System.out.println(resSet.toString());
        scanner.close();
    }
}
