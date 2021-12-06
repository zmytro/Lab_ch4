package com.company;
import java.util.Scanner;
public class Ex4_35_SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while(check==1) {
            System.out.println("Введите ненулевые значения");
            System.out.print("Введите 1 сторону треугольника: ");
            int side1 = sc.nextInt();
            if (side1 == 0) {
                System.err.println("Вы ввели неправильное значение");
                check = 0;
                break;
            }
            System.out.print("Введите 2 сторону треугольника: ");
            int side2 = sc.nextInt();
            if (side2 == 0) {
                System.err.println("Вы ввели неправильное значение");
                check = 0;
                break;
            }
            System.out.print("Введите 3 сторону треугольника: ");
            int side3 = sc.nextInt();
            if (side3 == 0) {
                System.err.println("Вы ввели неправильное значение");
                check = 0;
                break;
            }
            if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
                System.out.println("Стороны -> " + side1 + " " + side2 + " " + side3 + " -являются сторонами треугольника");
            } else
                System.out.println("Стороны -> " + side1 + " " + side2 + " " + side3 + " -не являются сторонами треугольника");
        }
        }

    }
