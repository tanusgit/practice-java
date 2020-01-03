package mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
	public static String mortgage(double interest, int years, double principal) {
		double r = (1 + interest);
		int months = years * 12;
		double m1 = interest * (Math.pow(r, months));
		double m2 = (Math.pow(r, months)) - 1;
		double mortgage = principal * (m1 / m2);
		String format = NumberFormat.getCurrencyInstance().format(mortgage);
		// System.out.println("mortage: " + format);
		return format;
	}

	public static double principal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal:");
		double principal = scan.nextDouble();
		boolean enter = (principal < 1);
		while (enter) {
			System.out.println("Enter a number greater than zero");
			principal = scan.nextDouble();
			// if(principal > 0)
			// if(enter == false) wrong implementation because in while loop enter 
			//is always true at first time check
			// if(enter = (principal>0))
			// break;
			if (principal > 0)
				enter = false;
		}
		return principal;
	}

	public static int years() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter years:");
		int years = scan.nextInt();
		boolean enter2 = (years < 1);
		while (enter2) {
			System.out.println("Enter a number greater than zero");
			years = scan.nextInt();
			if (years > 0)
				enter2 = false;
		}
		return years;
	}

	public static double interest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter interest rate:");
		double interest = scan.nextDouble();
		boolean enter1 = (interest < 1);
		while (enter1) {
			System.out.println("Enter a number greater than zero");
			interest = scan.nextDouble();
			if (interest > 0)
				enter1 = false;
		}
		interest = (interest / 100) / 12;
		//System.out.println(interest);
		return interest;
		
	}
}
