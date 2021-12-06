package com.company;

public class Ex4_17_GasMileage {
    /*Объявление переменных*/
    double Miles_total, Gas_total;

    /*Геттеры*/
    public double getTripRESULT(int miles, int gas_gallons) {
        Miles_total = Miles_total + miles;
        Gas_total = Gas_total + gas_gallons;

        return miles / (double) gas_gallons;
    }

    public double getTotalMiles(){
        return Miles_total;
    }

    public double getTotalGallons(){
        return Gas_total;
    }

    public double getTotalRESULT(){
        return Miles_total / Gas_total;
    }
}