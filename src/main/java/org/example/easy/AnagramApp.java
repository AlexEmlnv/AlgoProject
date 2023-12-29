package org.example.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AnagramApp {
    public static void main(String[] args) {
        // ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = scanner.next();
        System.out.println("Enter second word:");
        String secondWord = scanner.next();

        String[] firstArr = firstWord.split("");
        Set<String> firstSet = Arrays.stream(firstArr).collect(Collectors.toSet());
        String[] secondArr = secondWord.split("");
        Set<String> secondSet = Arrays.stream(secondArr).collect(Collectors.toSet());

        System.out.println("Result:");
        System.out.println(firstSet.contains(secondSet) && secondSet.contains(firstSet) ? 1 : 0);
    }
}
