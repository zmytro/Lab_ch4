package com.company;

import java.util.Scanner;

public class Ex4_17_GasMileageTest {

        public static void main(String[] args){
            int miles, gallons;
            boolean answ = true;
            char temp;

            Scanner sc = new Scanner(System.in);
            Ex4_17_GasMileage input = new Ex4_17_GasMileage();

            while(answ != false){

                System.out.print("Введите пройденный путь(в милях): ");
                miles = sc.nextInt();
                System.out.print("Введите расход топлива: ");
                gallons = sc.nextInt();

                System.out.printf("Ваш расход за пройденный путь: %.2f миль/галлон \n",input.getTripRESULT(miles,gallons));
                System.out.print("Ввести другой путь? (y/n): ");
                temp = sc.next().charAt(0);
                if(temp == 'n' || temp == 'N' || temp == 'т')
                    answ = false;

            }

            System.out.println("\n|-|-|-|-|-|-|-|-|-|-|\n");
            System.out.println("ОБЩИЙ РАСХОД");
            System.out.printf("Общий пробег: %.2f миль\nОбщий расход топлива: %.2f галлонов\n",
                    input.getTotalMiles(), input.getTotalGallons());
            System.out.printf("Общий расход миль/галлон: %.2f миль/галлон", input.getTotalRESULT());
        }
    }

