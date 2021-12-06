package com.company;
import java.util.Scanner;
public class Ex4_36_SidesOfRightTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while(check==1) {
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
            int hypotenuse;
            int a, b;
            if (side1 > side2 && side1 > side3) {
                hypotenuse = side1;
                a = side2;
                b = side3;
            } else if (side2 > side1 && side2 > side3) {
                hypotenuse = side2;
                a = side1;
                b = side3;
            } else {
                hypotenuse = side3;
                a = side1;
                b = side2;
            }
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2)) {
                System.out.println("Прямоугольный треугольник");
            } else System.out.println("Не прямоугольный треугольник");
        }
        }
    }
}
