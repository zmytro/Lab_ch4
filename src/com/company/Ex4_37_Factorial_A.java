package com.company;

import java.util.Scanner;

public class Ex4_37_Factorial_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите положительное число: (0-выход)");
            int number = sc.nextInt();
            if (number == 0) {
                flag = false;
            }
            if (number < 0) {
                while (number < 0) {
                    System.err.println("Введите положительное число");
                    number = sc.nextInt();
                }
            }

            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println(number + "! = " + result);
        }
    }
}
