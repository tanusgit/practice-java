package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRank {
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
				sum = sum + marks1 ;
			}
			System.out.println(student.get(s) + " got total " + sum);
			Allmarks.add(sum);
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
		System.out.println("the maximum total is  " + bigger + "and the "
				+ "student who got is " + student.get(index));

	}

}
