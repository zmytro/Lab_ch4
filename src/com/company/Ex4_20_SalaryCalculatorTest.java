package com.company;

import java.util.Scanner;

public class Ex4_20_SalaryCalculatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ex4_20_SalaryCalculator salary = new Ex4_20_SalaryCalculator();

        for(int i=1; i<4; i++){
            System.out.printf("Работник №%d - рабочих часов за неделю: ", i);
            salary.setHours(sc.nextDouble());

            System.out.printf("Работник №%d - оплата за час: ", i);
            salary.setHourlyPay(sc.nextDouble());

            System.out.printf("Работник №%d - зарплата: %.2f$\n", i, salary.grossPay());
        }
    }
}
