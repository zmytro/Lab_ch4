package com.company;

import java.util.Scanner;

public class Ex4_29_SquareOfAsteriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sides = 0;
        while(sides == 0 || sides > 20){
            System.out.print("Введите число от 1 до 20: ");
            int input = sc.nextInt();

            if(input > 0 && input <= 20)
                sides = input;
        }
        rectOuter(sides);
    }

    public static void rectOuter(int sides) {

        String Asteriks = "*";
        String Space = " ";

        for (int i = 0; i < sides; i++) {

            for (int j = 0; j < sides; j++)

                if (i == 0 || j == 0 || i == sides - 1 || j == sides - 1)
                    System.out.print(Asteriks + Space);
                else
                    System.out.print(Space + Space);

            System.out.println();
        }
    }
}