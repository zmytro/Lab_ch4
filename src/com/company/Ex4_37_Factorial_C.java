package com.company;

import java.util.Scanner;

public class Ex4_37_Factorial_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow, num, counter, auxCounter;
        double result, factorial;
        boolean flag = true;
        while (flag) {
            System.out.print("Введите степень е: ");
            pow = sc.nextInt();

            System.out.print("Введите положительное число эл-тов: ");
            num = sc.nextInt();
            if (num == 0) {
                flag = false;
            }
            if (num < 0) {
                while (num < 0) {
                    System.err.println("Введите положительное число эл-тов");
                    num = sc.nextInt();
                }
            }
            result = 1;
            counter = 1;

            while (counter <= num) {
                auxCounter = counter;
                factorial = 1;
                while (auxCounter > 0) {
                    factorial *= auxCounter;
                    auxCounter--;
                }

                result += Math.pow(pow, counter) / factorial;
                counter++;
            }

            System.out.printf("e^%d = %f", pow, result);
        }
    }
}
