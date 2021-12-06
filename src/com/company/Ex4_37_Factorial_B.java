package com.company;
import java.util.Scanner;
public class Ex4_37_Factorial_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        double result, factorial;
        int num, auxCounter;
while(flag) {
    System.out.print("Введите положительное значение: (0 - выход)");
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
    result = 0;

    int counter = 0;
    for (int i = counter; i < num; i++) {

        auxCounter = counter;
        factorial = 1;
        while (auxCounter > 1) {
            factorial *= auxCounter;
            auxCounter--;
        }

        result += 1 / factorial;

        counter++;
    }

    System.out.printf("e = %f \n", result);
}
    }
}
