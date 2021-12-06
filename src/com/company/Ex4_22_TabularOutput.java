package com.company;

public class Ex4_22_TabularOutput {
    public static void main( String[] args )
    {
        int counter = 0;

        for(int i=1; i<=6; i++){
            if(counter == 0) {
                System.out.println("N\t\t10*N\t100*N\t1000*N");
                counter++;
            }
            if(i<10) {
                System.out.println(i + "\t\t" + i * 10 + "\t\t" + i * 100 + "\t\t" + i * 1000);
            }
            if(i>=10) {
                System.out.println(i + "\t\t" + i * 10 + "\t\t" + i * 100 + "\t" + i * 1000);
            }
            }
        }
    }

