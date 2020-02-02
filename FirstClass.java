package linklist;
import java.util.Scanner;


public class FirstClass {
	Scanner scan = new Scanner(System.in);
	public void show() {
	System.out.print("Please enter 2 numbers");
	int input = scan.nextInt();
	int input2 = scan.nextInt();
	if(input > input2) {
		System.out.print("the bigger number is : " + input + " and the smaller number"
				+ " is " + input2);
	}
	else if (input == input2) {
		System.out.print("both numbers are same");
	}
	else {
			System.out.print("the bigger number is : " + input2 + " and the smaller"
					+ "number is " + input);
		}
	}
	
	
	public void threeNum() {
		System.out.print("Please enter 3 numbers");
			int input = scan.nextInt();
			int input2 = scan.nextInt();
			int input3= scan.nextInt();
			if(input > input2) {
				if(input>input3) {
					System.out.println(input + " is bigger");
				}
				else {
					System.out.println(input3 + " is bigger");
				}
			}
			else if (input2 > input) {
					if(input2 > input3) {
						System.out.println(input2 + " is bigger");
					}
					else
						System.out.println(input3 + " is bigger");
			}
			else 
				System.out.println(input3 + " is bigger");
		
	}
	
	public void threeNumSmall() {
		System.out.print("Please enter 3 numbers");
			int input = scan.nextInt();
			int input2 = scan.nextInt();
			int input3= scan.nextInt();
			if(input < input2) {
				if(input< input3) {
					System.out.println(input + " is smaller");
				}
				else {
					System.out.println(input3 + " is smaller");
				}
			}
			else if (input2 < input) {
					if(input2 < input3) {
						System.out.println(input2 + " is smaller");
					}
					else
						System.out.println(input3 + " is smaller");
			}
			else 
				System.out.println(input3 + " is smaller");
		
	}
	
	public void equalString(String a, String b) {
		if (a.equals(b)) {
			System.out.println("both the strings are same");
		}
		else
			System.out.println("Strings are not same");
		
	}
	
	
	

}
