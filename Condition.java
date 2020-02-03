package Conditions;

import java.util.Scanner;

public class Condition {
	Scanner scan = new Scanner(System.in);
	public int big(int x, int y) {
		return x > y? x : y;
		
	}
	
	
	public void show() {
		System.out.print("Please enter 2 numbers");
		int input = scan.nextInt();
		int input2 = scan.nextInt();
		int bigger = big(input, input2);
		int smaller = small(input, input2);
		System.out.println("big num is " + bigger);
		System.out.println("small num is"+ smaller);
		

}
	
	public int small(int x, int y) {
		return x < y? x : y;
	}
	
	
	public void threeNum() {
		System.out.print("Please enter 3 numbers");
			int input = scan.nextInt();
			int input2 = scan.nextInt();
			int input3= scan.nextInt();
			int bigger = big(input, big(input2, input3));
			System.out.println("bigger num is :" +bigger);
		
	}
	
	public void threeNumsmall() {
		System.out.print("Please enter 3 numbers");
			int input = scan.nextInt();
			int input2 = scan.nextInt();
			int input3= scan.nextInt();
			int smaller = small(input, small(input2, input3));
			System.out.println("bigger num is :" +smaller);
		
	}
	
	
	
	
		
	
}
