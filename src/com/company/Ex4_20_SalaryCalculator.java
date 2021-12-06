package com.company;

public class Ex4_20_SalaryCalculator {
    private static double default_time = 40.0;
    private static double overtime = 1.5;

    private double hours, pay;

    public void setHours(double hours){
        this.hours = hours;
    }
    public void setHourlyPay(double pay){
        this.pay = pay;
    }
    public double grossPay(){
        return hours > 40 ?
                (pay * default_time) + ((hours - default_time) * (pay * default_time)) :
                hours * pay;
    }
}
