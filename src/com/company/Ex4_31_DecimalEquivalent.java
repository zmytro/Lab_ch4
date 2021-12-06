package com.company;
import java.util.Scanner;
public class Ex4_31_DecimalEquivalent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while(check==true) {
            System.out.print("Введите число в двоичной системе: ");

            int binary = scanner.nextInt();
            int decimal = 0;
            int temp = binary;
            int counter = 0;

            while (temp > 0) {
                int rem = temp % 10;
                temp = temp / 10;
                decimal += rem * Math.pow(2, counter);
                counter++;
            }

            System.out.printf("Число [%d] в двоичном коде - это [%d] в десятичном%n", binary, decimal);
            System.out.println("Продолжить? (y/n)");

            char answ = scanner.next().charAt(0);
            if(answ == 'y') {
                check = true;
            }else check = false;
            }
            scanner.close();
        }
    }

