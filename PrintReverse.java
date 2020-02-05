package loop;

public class PrintReverse {
	
	public static void main(String[] args) {
		PrintReverse m = new PrintReverse();
		//m.reverseFive(5);
		Print123 n = new Print123();
		//n.Print123N(3);
		PrintFive k = new PrintFive();
		//k.printFive(5);
		PrintFactorial f = new PrintFactorial();
		//f.factorial(5);
		PrintStop100 s = new PrintStop100();
		//s.stop100(11);
		//s.stop999(654);
		PrintTable p = new PrintTable();
		//p.table(3);
		PrintSum s1 = new PrintSum();
		//s1.sum(3);
		
		PrintEvenOdd even = new PrintEvenOdd();
		//even.printEven2(22);
		//PrintStop100.stop100(50);
		//PrintStop100.stop999(600);
		//PrintStop100.printinorder(3);
		
		//PrintScannerInput.printUserInput();
		PrintScannerInput.sumofNum999();
		//PrintScannerInput.small("123");
		//PrintScannerInput.sumofNum999();
		//PrintScannerInput.rank();
		//int [] array = { 2, 5, 8, 6, 1, 11, 12, 13};
		//int res = PrintScannerInput.small(array);
		//System.out.println(res);
	}
	
	public void printFive(int num) {
		for (int k = 1; k < num + 1; k++) {
			for (int i = 1; i < k + 1; i++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}
	
	
	
	
	
	
	public void reverseFive(int num) {
		for (int k = num; k >= 1; k--) {
			for (int i = num; i >= k; i--) {
				System.out.print( i + " ");
			}
			System.out.println(" ");
		}

	}
	
	public void reverseFiveN(int num) {
		for (int k = 1; k < num+1 ; k++) {
			for (int i = num; i >= k; i--) {
				System.out.print( i + " ");
			}
			System.out.println(" ");
		}

	}

}
