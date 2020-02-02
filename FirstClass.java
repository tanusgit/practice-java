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
	
	
	
	public void validation(int id, int age, String agent) {
		if (id < 1) {
			System.out.println("Id should be positive");
		}
		else
			System.out.println("valid Id");
		if(age < 18) {
			System.out.println("Age should be more than 18");
		}
		else
			System.out.println("Age is valid");
		if (!agent.equals("agent")) {
			System.out.println("Invalid user type");
		}
		else
		System.out.println("valid user");
	}
	
	public void cityService(String city) {
		switch(city) {
		case "Hyderabad" : System.out.println("service is availalbe");
		break;
		case "Mumbai" : System.out.println("service is availalbe");
		break;
		case "bangalore" : System.out.println("service is availalbe");
		break;
		case "Delhi" : System.out.println("service is availalbe");
		default : System.out.println("service is not availalbe");
		}	
	}
	
	public void bankService(String bank) {
		switch(bank) {
		case "ICICI" : System.out.println("ROI is 10%");
		break;
		case "SBI" : System.out.println("ROI is 11%");
		break;
		case "CITI" : System.out.println("ROI is 12%");
		break;
		case "HDFC" : System.out.println("ROI is 13%");
		default : System.out.println("Invalid bank");
		}	
	}
	
	public void validation2(int id, int age, String agent) {
		if (id < 1) {
			System.out.println("Id should be positive");
		}
		else {
			System.out.println("Id is positive");
			if(age < 18)
			{
				System.out.println("Age should be more than 18");
			}
			else
			{
				System.out.println("Age is valid");	
				if (agent.equals("agent")) {
					System.out.println("User type is valid");
				}
				else
					System.out.println("Invalid user type");
				
			}
				
		}
	}
			
	
	
	

}
