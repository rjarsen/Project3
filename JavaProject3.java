//=======================================
// Author: Robert Arsenault
// Date: 5/27/23
// Description: Change Calculator
//=======================================
package javaproject3;

import java.util.Scanner;

public class JavaProject3 {
public static void main(String[] args) {
        // Declarations
        int totalCent;

        System.out.println("Welcome to the Change Calculator");

        // While condition check and user input
        char choice = 'y';
        Scanner scanner = new Scanner(System.in);
        while (choice == 'y' || choice == 'Y') {
            System.out.print("\nEnter number of cents (0-99): ");
            totalCent = scanner.nextInt();

            // Calculate and Display results
            System.out.println("\nQuarters: " + totalCent / 25);
            totalCent = totalCent % 25;
            System.out.println("Dimes:    " + totalCent / 10);
            totalCent = totalCent % 10;
            System.out.println("Nickles:  " + totalCent / 5);
            totalCent = totalCent % 5;
            System.out.println("Pennies:  " + totalCent / 1);

            System.out.print("\nContinue? (y/n): ");
            choice = scanner.next().charAt(0);
        }

        System.out.println();
    }
}
