package object;

public class Calc {
	public static void main(String[] args) {
		callingAllMethods();
		
	}
	
	
	
	public static int add(int a, int b) {
		return a * b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	
	public static void callingAllMethods() {
		int a = add(3, 2);
		int s = sub(3, 2);
		int m = multi(3, 2);
		int d = div(3, 2);
		System.out.println("addition: " + a + "\n" + "subtraction: " + s + "\n" + "multiplication: " + m + "\n"
				+ "division: " + d);
	}
}
