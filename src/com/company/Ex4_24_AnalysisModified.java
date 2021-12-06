// Fig. 4.12: Analysis.java
// Analysis of examination results using nested control statements.
package com.company;

import java.util.Scanner; // class uses class Scanner

public class Ex4_24_AnalysisModified
{
    public static void main(String[] args)
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // process 10 students using counter-controlled loop
        while (studentCounter <= 10)
        {
            // prompt user for input and obtain value from user
            System.out.print("Enter result " + studentCounter + " (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // if...else is nested in the while statement
            if (result == 1) {
                passes = passes + 1;
                studentCounter = studentCounter + 1;
            }
            if (result == 2) {
                failures = failures + 1;
                studentCounter = studentCounter + 1;
            }
            if (result < 1 || result > 2) {
                System.err.println("Введено неправильное число,введите 1 или 2");
                continue;
            }
            // increment studentCounter so loop eventually terminates

        }

        // termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
} // end class Analysis

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
