package com.company;

import java.util.Scanner;

public class Ex4_21_LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Введите " + counter + " число: ");
            int num = scanner.nextInt();

            if (counter == 1)
                largest = num;
            else if (num > largest)
                largest = num;

            counter++;
        }
        System.out.print("Наибольшее число - " + largest);
    }

}

