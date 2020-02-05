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
			smaller = small(list);

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
		int small = 0;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("enter num");
		while (true) {
			int input = sc.nextInt();
			list.add(input);
			sum = sum + input;
			System.out.println("the sum of the numbers is " + sum + "");
			if (input > big) {
				big = input;
			}
			small = smallarraylist(list);
			
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
				System.out.println("enter marks for 3 subjects for " + student.get(s));
				for (int i = 0; i < 3; i++) {
					int marks1 = sc.nextInt();
					sum = sum + marks1;
				}
				System.out.println(student.get(s) + " got total " + sum);
				Allmarks.add(sum);
			}
		} catch (Exception e) {

		}
		System.out.println("all students total marks is " + Allmarks);
		for (int k = 0; k < Allmarks.size(); k++) {
			if (bigger < Allmarks.get(k)) {
				bigger = Allmarks.get(k);
				index = Allmarks.indexOf(bigger);
			}
		}
		System.out.println("the maximum total is  " + bigger + "and the " + "student who got is " + student.get(index));

	}

	public static int small(int[] array) {
		int smallnum = 0;
		try {
			int size = array.length;
			smallnum = array[0];
			for (int i = 0; i < size; i++) {
				if (smallnum > array[i + 1]) {
					smallnum = array[i + 1];
					
				} else
					smallnum = smallnum;

			}
		} catch (Exception e) {

		}
		return smallnum;

	}
	
	
	
	public static int smallarraylist(ArrayList<Integer> array) {
		int smallnum = 0;
		try {
			int size = array.size();
			smallnum = array.get(0);
			for (int i = 0; i < size; i++) {
				if (smallnum > array.get(i + 1)) {
					smallnum = array.get(i + 1);
					
				} else
					smallnum = smallnum;

			}
		} catch (Exception e) {

		}
		return smallnum;
	}
	
	//print diagonal values
	public static void printDiagonal(int num) {
		int count = 1;
		for (int j = 1; j <= num; j++) {
			for (int i = 1; i <= num; i++) {
				if(i == j)
					System.out.print(count);
				
				if(i + j == num+1) {
					System.out.print(count);
				}
				count++;
			}
			System.out.println(" ");
		}

	}

}
