package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintScannerInput {
	static int sum = 0;
	static int big = 0;
	static int small = 0;
	// 4. Input hw many nums and what are the nums:
	// and print sum , big , small nums

	public static void printUserInput() {
		int smaller = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers?");
		int numbers = sc.nextInt();
		int[] list = new int[numbers];
		System.out.println("enter num");
		for (int i = 0; i < numbers; i++) {
			int input = sc.nextInt();
			list[i] = input;
			if (input > big) {
				big = input;
			}
			smaller = list[0];
			if (smaller >= list[i]) {
				smaller = list[i];
			}
			/*
			 * try{ for(int k = 0; k <list.length; k ++) { if(list[k] < list[k+1]) { small =
			 * list[k]; } } } catch( Exception e) {
			 * 
			 * }
			 */

			sum = sum + input;

		}
		System.out.println("the sum of the numbers is " + sum + "");
		System.out.println("the bigger number is " + big + "");
		System.out.println("the smaller number is " + smaller + "");

	}

	// 7.take nums as input
	// and perform sum
	// if the sum reaches 100 , stop and print final sum
	public static void sumofNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		while (true) {
			int input = sc.nextInt();
			sum = sum + input;
			System.out.println("the sum of the numbers is " + sum + "");
			if (sum >= 100)
				break;
		}
	}

	//
	// 8.take nums as input and if we enter 999 thats end of input
	// and print sum , big , small nums
	public static void sumofNum999() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter num");
		while (true) {
			int input = sc.nextInt();
			sum = sum + input;
			System.out.println("the sum of the numbers is " + sum + "");
			if (input > big) {
				big = input;
			}
			if (input == 999)
				break;
		}
		System.out.println("the bigger number is " + big + "");
		System.out.println("the smaller number is " + small + "");
	}

	// 5.Help teacher to find first rank for input
	// student name + sub1 + sub2 + sub3
	// how many students
	// ask for student’s name and subs

	public static void rank() {
		int sum = 0;
		int bigger = 0;
		int index = 0;
		ArrayList<String> student = new ArrayList<>();
		ArrayList<Integer> Allmarks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students?");
		int numbers = sc.nextInt();
		System.out.println("enter student's name");
		for (int i = 0; i < numbers; i++) {
			String input = sc.next();
			student.add(input);

		}
		System.out.println(student);
		try {
		for (int s = 0; s < numbers; s++) {
			for (int i = 0; i < 3; i++) {
				System.out.println("enter marks for 3 subjects for " + student.get(i));
				int marks1 = sc.nextInt();
				int marks2 = sc.nextInt();
				int marks3 = sc.nextInt();
				sum = marks1 + marks2 + marks3;
				System.out.println(student.get(i) + " got total " + sum);
				Allmarks.add(sum);
			}
			
		
		}
	}catch(Exception e) {
		
	}
		System.out.println("all students total marks is " + Allmarks);
		for(int k = 0; k < Allmarks.size(); k++) {
			if(bigger < Allmarks.get(k)) {
				bigger = Allmarks.get(k);
				index = Allmarks.indexOf(bigger);
			}
		}
		System.out.println("the maximum total is  " + bigger + " " + student.get(index));

	}

	public static void small(String s) {
		int m = s.length();
		for (int i = 0; i < m; i++) {
			char res = s.charAt(i);
			System.out.print(res);

		}
	}

}
