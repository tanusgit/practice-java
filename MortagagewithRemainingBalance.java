package mortgage;

import java.text.NumberFormat;
import java.util.*;

public class Main {
	public static void main(String args[]) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Enter principal:"); double principal =
		 * scan.nextDouble(); boolean enter = (principal < 1); while(enter){
		 * System.out.println("Enter a number greater than zero"); principal =
		 * scan.nextDouble(); //if(principal > 0) //if(enter == false) wrong
		 * implementation //if(enter = (principal>0)) // break; if(principal >
		 * 0) enter = false; }
		 * 
		 * System.out.println("Enter interest rate:"); double interest =
		 * scan.nextDouble(); boolean enter1 = (interest < 1); while(enter1){
		 * System.out.println("Enter a number greater than zero"); interest =
		 * scan.nextDouble(); if(interest > 0) enter1 = false; } interest =
		 * (interest/100)/12;
		 * 
		 * 
		 * System.out.println("Enter years:"); int years = scan.nextInt();
		 * boolean enter2 = (years < 1); while(enter2){
		 * System.out.println("Enter a number greater than zero"); years =
		 * scan.nextInt(); if(years > 0) enter2 = false; }
		 * 
		 * double principal = Mortgage.principal(); double interest =
		 * Mortgage.interest(); int years = Mortgage.years();
		 */
		double principal = (double) read("principal: ", 0);
		double interest = (double) read("interest: ", 0);
		interest = interest / 100 / 12;
		int years = (int) read("years: ", 0);

		String result = Mortgage.mortgage(interest, years, principal);
		System.out.println("your mortgage is " + result);
		remainingBalance(principal, interest, years);

	}

	public static double read(String prompt, double min) {
		Scanner scan = new Scanner(System.in);
		double value;
		System.out.println(prompt);
		value = scan.nextDouble();
		boolean enter2 = (value < min);
		while (enter2) {
			System.out.println("Enter a number greater than " + min);
			value = scan.nextInt();
			if (value > min)
				enter2 = false;
		}
		return value;
	}

	public static void remainingBalance(double principal, double interest,
			int years) {
		double balance;
		int months = years * 12;
		for (int i = 1; i <= months; i++) {
			double r = (1 + interest);
			balance = (principal * ((Math.pow(r, months)) - (Math.pow(r, i))))
					/ ((Math.pow(r, months)) - 1);
			System.out.println("After " + i + " payment your mortgage is"
					+ ": "
					+ (NumberFormat.getCurrencyInstance().format(balance)));

		}
	}

}
