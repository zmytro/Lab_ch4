package com.company;

import java.util.Scanner;

public class Ex4_23_TwoLargestNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first_largest = 0;
        int second_largest = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Введите " + counter + " число: ");
            int num = scanner.nextInt();

            if (counter == 1) {
                first_largest = num;
                second_largest = 0;
            }
            if (num > first_largest) {
                second_largest = first_largest;
                first_largest = num;
            }
            else if(num > second_largest){
                second_largest = num;
            }
            counter++;
        }
        System.out.println("Наибольшее число 1 - " + first_largest);
        System.out.println("Наибольшее число 2 - " + second_largest);
    }

}

