package com.company;

public class Ex4_19_SalesCommission {
    double default_pay = 200.0;
    double commission = 0.09;

    private static double total;
    /*список товаров*/
    public static void enterItem(int x){
        switch(x){
            case 1:
                total += 239.99;
                break;
            case 2:
                total += 129.75;
                break;
            case 3:
                total += 99.95;
                break;
            case 4:
                total += 350.89;
                break;
            default:
                break;
        }
    }
    public double getSalesTotal(){
        return total;
    }
    public double calculateCommission(){
        return default_pay + total * commission;
    }
}
