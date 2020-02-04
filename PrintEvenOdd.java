package loop;

public class PrintEvenOdd {
	
	public void print10(int num) {
		for (int i = 1; i < num + 1; i++) {
			System.out.print(i + " ");

		}
	}

	public void printEven(int num) {
		for (int i = 2; i < num + 1; i++) {
			if ((i % 2) == 0)
				System.out.print(i + " ");

		}
	}
	
	public void printEven2(int num) {
		for (int i = 2; i < num + 1; i = i + 2) {
				System.out.print(i + " ");

		}
	}
	

	public static void printOdd(int num) {
		for (int i = 2; i < num + 1; i++) {
			if (!((i % 2) == 0))
				System.out.print(i + " ");

		}
	}
	
	
	public static void printOdd2(int num) {
		for (int i = 1; i < num + 1; i = i + 2) {
				System.out.print(i + " ");

		}
	}

}
