package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintScannerInput {
	public static void main(String[] args) {
		printDiagonal(3);
		//printUserInput2();
		//thirdSumofNum999();
		//sumofNum();
		//small("123");
		//sumofNum999();
		//rank();
		//rank2();
	}

	// 4. Input hw many nums and what are the nums:
	// and print sum , big , small nums

	

	public static void printUserInput() {
		int big = 0;
		int sum = 0;
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
	
	public static void printUserInput2() {
		int big =0;
		int small = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers?");
		int numbers = sc.nextInt();
		for (int i = 0; i < numbers; i++) {
			System.out.println("enter num" + (i+1));
			int input = sc.nextInt();
			if(i == 0) {
				big = input;
				small = input;
			}
			if (input > big) {
				big = input;
			}
			if(small > input) {
			small = input;
			}
			sum = sum + input;

		}
		System.out.println("the sum of the numbers is " + sum + "");
		System.out.println("the bigger number is " + big + "");
		System.out.println("the smaller number is " + small + "");

	}
	
	
	
	
	

	// 7.take nums as input
	// and perform sum
	// if the sum reaches 100 , stop and print final sum
	public static void sumofNum() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		while (true) {
			int input = sc.nextInt();
			sum = sum + input;
			if (sum >= 100)
				break;
		}
		System.out.println("the sum of the numbers is " + sum + "");
	}
	
	
	
	public static void sumofNum2() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		while (sum < 100){
			int input = sc.nextInt();
			sum = sum + input;
		}
		System.out.println("the sum of the numbers is " + sum + "");
	}
	
	
	//if input is less than 0 dont perform sum
	public static void sumofNum3() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		while (sum < 100){
			int input = sc.nextInt();
			if(input > 0) {
			sum = sum + input;
			}
			
		}
		System.out.println("the sum of the numbers is " + sum + "");
	}
	
	
	//approach2 of the above
	public static void sumofNum4() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		while (sum < 100){
			int input = sc.nextInt();
			if(input < 0) {
				continue;
			}
			sum = sum + input;
			
		}
		System.out.println("the sum of the numbers is " + sum + "");
	}
	
	//above function + if client enters 999 don't take input and
	//don't consider 999 as an integer its just an indication 
	
	public static void sumofNum5() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		while (sum < 100){
			int input = sc.nextInt();
			if(input < 0) {
				continue;
			}
			if(input == 999) {
				break;
			}
			sum = sum + input;
			
		}
		System.out.println("the sum of the numbers is " + sum + "");
	}

	//
	// 8.take nums as input and if we enter 999 thats end of input
	// and print sum , big , small nums
	public static void sumofNum999() {
		int big = 0;
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int small = 0;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("enter num");
		while (true) {
			int input = sc.nextInt();
			if (input == 999)
				break;
			list.add(input);
			sum = sum + input;
			System.out.println("the sum of the numbers is " + sum + "");
			if (input > big) {
				big = input;
			}
			small = smallarraylist(list);	
			
		}
		System.out.println("the bigger number is " + big + "");
		System.out.println("the smaller number is " + small + "");
	}

	
	public static void secondSumofNum999() {
		boolean isFirstNum = true;
		int big = 0;
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int small = 0;
		int count = 0;
		System.out.println("enter num");
		while (true) {
			int input = sc.nextInt();
			if (input == 999)
				break;
			sum = sum + input;
			System.out.println("the sum of the numbers is " + sum + "");
			//this if will execute only once because we dont want other values to be assigned
			//to the big and small variables
			//if(count++ == 0) {
			//if(count== 0) {
			if(isFirstNum) {
				isFirstNum = false;
				//count = 1;
				big = input;
				small = input;
			}
			if (input > big) {
				big = input;
			}
			if (small > input) {
				small = input;
			}
			
		}
		System.out.println("the bigger number is " + big + "");
		System.out.println("the smaller number is " + small + "");
	}
	
	
	public static void thirdSumofNum999() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int input = sc.nextInt();
		int sum = 0;
		int small = input;
		int big = input;
		do {
			sum = sum + input;
			
			if (input > big) {
				big = input;
			}
			if (small > input) {
				small = input;
			}
			input = sc.nextInt();
			
		}while (input != 999);
		System.out.println("the sum of the numbers is " + sum + "");
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
	
	
	public static void rank2() {
		int bigger = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students? ");
		int numbers = sc.nextInt();
		
		for (int i = 0; i < numbers; i++) {
			System.out.println("enter student's name");
			String input = sc.next();
			int sum = 0;
			System.out.println("enter subject1: ");
			sum = sum + sc.nextInt();
			System.out.println("enter subject2: ");
			sum = sum + sc.nextInt();
			System.out.println("enter subject3: ");
			sum = sum + sc.nextInt();
			if (sum > bigger) {
				name = input;
				bigger = sum;
			}
			
		}
		
		
		System.out.println("the maximum total is  " + bigger + " and the " + 
		"student who got is " + name);

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
		String diagonal1 = "";
		String diagonal2 = "";
		int count = 1;
		for (int j = 1; j <= num; j++) {
			for (int i = 1; i <= num; i++) {
				if(i == j)
					diagonal1 = diagonal1 + " " + count;
				if(i + j == num+1) {
					diagonal2 = diagonal2 + " " + count;
				}
				count++;
			}
		}
		System.out.println(diagonal1 + "\n" +  diagonal2);

	}

}
