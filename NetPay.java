/*
 * NetPay.java
 * Author:  Sharon Agbita 
 * Submission Date:  [Submission date here]
 *
 * Purpose: My program computes taxes and pay. It allows for a user to input the number of hours they 
 * worked per week and gives them their gross pay, net pay, and deductions from the hours given. My program
 * shows calculations like the deductions sum, how to get the gross and net pay, and the math of the each deduction
 *  percent divided by a 100.
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
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;
public class NetPay {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Here the user types the amount of hours worked
		System.out.print("Hours per Week: \t");
		double hoursPerWeek = keyboard.nextDouble();
		
		//Deductions
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Deductions sum
		double deductions = FEDERAL_TAX_PERCENT + STATE_TAX_PERCENT + SS_PERCENT + MEDICARE_PERCENT + PAY_PER_HOUR;
		
		//Gross Pay
		double grossPay = PAY_PER_HOUR * hoursPerWeek;
		
		//Calculations for each percentage: percent/100 * grossPay
		double federal = .10 * grossPay;
		double state = .045 * grossPay;
		double socialSecurity = .062 * grossPay;
		double medicare = .0145 * grossPay;
		
		//Net Pay
		double netPay = grossPay - deductions;
		
		//Outputs
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + federal);
		System.out.println("State: \t\t\t" + state);
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t\t" + medicare);
		
		keyboard.close();
	}

}

