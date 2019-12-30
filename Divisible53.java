import java.util.*;

public class DivisbleNum {
	public static void main (String args[]){
		Scanner m = new Scanner(System.in);
		System.out.println("press a number");
		int input = m.nextInt();
		int divisible = input%5;
		int d = input %3;
		if (d == 0 && divisible == 0){
			System.out.println("FizzBuzz");
		}
		else if(divisible == 0){
			System.out.println("Fizz");
		}
		else if (d == 0){
			System.out.println("Buzz");
		}
		else if (d != 0){
			System.out.println(d);
		}
		else if (divisible != 0){
			System.out.println(divisible);
		}
	}
}
