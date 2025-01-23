package org.example;

import org.example.task_1.Algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input m: ");
        int m = scanner.nextInt();
        Algorithm.calculate(m);
    }
}