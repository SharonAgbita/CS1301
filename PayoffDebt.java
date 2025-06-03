/*
 * PayOffDebt.java
 * Author: Sharon Agbita 
 * Submission Date: 01/28/2025
 *
 * Purpose: My program helps calculate and display the number of months 
 * needed to pay off credit card debt. It also also compute the total amount paid to the credit card 
 * company after all payments are made, the total the amount of interest paid, and the overpayment. 
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */

import java.util.Scanner;
import java.lang.Math;

public class PayoffDebt {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// Where the user will put their principal input
		System.out.print("Principal: \t\t\t");
		double principalInput = keyboard.nextDouble();

		// Where the user will put their annual interest rate input
		System.out.print("Annual Interest Rate (%): \t");
		double annualInterestRate = keyboard.nextDouble();

		// Where the user will put their monthly payment input
		System.out.print("Monthly Payment: \t\t");
		double monthlyPayment = keyboard.nextDouble();

		// Calculations for the exact number of months needed to pay off debt
		double numerator = Math.log(monthlyPayment)
				- Math.log(monthlyPayment - (annualInterestRate / 1200.0) * principalInput);
		double denominator = Math.log((annualInterestRate / 1200.0) + 1.0);
		double exactNumberOfMonths = numerator / denominator;

		// Ceiling rounds up the exact number of months needed to pay off debt
		double exactNumberOfMonthsCeiling = Math.ceil(exactNumberOfMonths);

		// Additional payment calculations
		double totalAmountPaid = exactNumberOfMonthsCeiling * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principalInput;
		double exactPaymentNeeded = exactNumberOfMonths * monthlyPayment;
		double overpayment = totalAmountPaid - exactPaymentNeeded;

		// Outputs
		System.out.printf("\nMonths needed to be paid off: \t%.0f\n", exactNumberOfMonthsCeiling);
		System.out.printf("Total Amount Paid: \t\t$%.2f\n", totalAmountPaid);
		System.out.printf("Total Interest Paid: \t\t$%.2f\n", totalInterestPaid);
		System.out.printf("Overpayment: \t\t\t$%.2f\n", overpayment);
		keyboard.close();
	}

}
