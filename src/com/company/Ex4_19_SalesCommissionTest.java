package com.company;


import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex4_19_SalesCommissionTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ex4_19_SalesCommission salesCal = new Ex4_19_SalesCommission();
        String name;
        System.out.println("Введите имя продавца: ");
        name = sc.next().toString();
        int item = 5;
        System.out.println("Добрый день," + name + "!");
        while(item != 0){
            System.out.printf("1 - 239.99$ \n2 - 129.75$ \n3 - 99.95$\n4 - 350.89$\n");
            System.out.print("Выберите товар для продажи (0 для выхода): ");
            item = sc.nextInt();

            salesCal.enterItem(item);
        }

        if(salesCal.getSalesTotal() > 0){
            System.out.print("\nРезультаты продавца: " + name +"\n");
            System.out.printf("Общие продажи за неделю: %.2f$\n", salesCal.getSalesTotal());
            System.out.printf("Выручка за неделю: 200$ + %.2f$  = %.2f$\n", salesCal.calculateCommission()-200,salesCal.calculateCommission());

        }
    }
}