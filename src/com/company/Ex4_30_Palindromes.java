package com.company;

import java.util.Scanner;

public class Ex4_30_Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int originalNumber = 0;

        while (originalNumber < 10000 || originalNumber > 99999) {
            System.out.println("Введите 5-ти значное число: ");
            originalNumber = sc.nextInt();

            if (originalNumber < 10000 || originalNumber > 99999)
                System.err.println("ОШИБКА! Введите 5-ти значное число");
        }
        int number = originalNumber;

        int reverseNumber = 0;

        while (number > 0) {
            int rem = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + rem;
        }

        if (originalNumber == reverseNumber)
            System.out.println(originalNumber + " - палиндром");
        else
            System.out.println(originalNumber + " - не палиндром");


    }
}
