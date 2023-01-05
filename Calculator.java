package oop;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
	
	Scanner stdin = new Scanner(System.in);
	   
    MinMaxCalculator calc = new MinMaxCalculator(); // Computes statistics for numbers entered by user. 
    						//uses the MinMaxCalculator since it inherits the public variables and methods of the parent class.
    

    double number; // One number entered by the user.

    System.out.println("Enter your numbers.  Enter 0 to end.");
    System.out.println();

    do {
       System.out.print(">>> ");
       number = stdin.nextDouble();
       if (number != 0)
          calc.enter(number);
    } while (number != 0);
    

    System.out.println("\nThe Statistics of your data:\n " );
    System.out.println("   Count:              " + calc.getCount());
    System.out.println("   Sum:                " + calc.getSum());
    System.out.println("   Minimum:            " + calc.getMin());
    System.out.println("   Maximum:            " + calc.getMax());
    System.out.println("   Average:            " + calc.getMean());
    System.out.println("   Standard Deviation: "
           + calc.getStandardDeviation());

 } // end main()

	

}
