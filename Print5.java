package Conditions;

public class Print5 {

	public void printFive(int num) {
		for (int k = 1; k < num + 1; k++) {
			for (int i = 1; i < k + 1; i++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}
	
	
	public void Print123N(int num) {
		//printing k as k decides what to print
		for(int k = 1; k < num +1; k++) {
		for (int i = 0; i < k; i++) {
			System.out.print(k);
		}
			
		System.out.println(" ");
		}
	}
	

	
	public void Print123many(int num) {
		for(int k = 1; k < num +1; k++) {
		for (int i = 1; i < num+1; i++) {
			for (int h = 1; h < i+1; h++) {
			System.out.print(h + " ");
			}
		System.out.println(" ");
		}
	}
}

	public void reverseFive(int num) {
		for (int k = 1; k < num + 1; k++) {
			for (int i = 1; i < k+1; i++) {
				System.out.print(num + " ");
				num = num -1;
			}
			System.out.println(" ");
		}

	}

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

	public void printOdd(int num) {
		for (int i = 2; i < num + 1; i++) {
			if (!((i % 2) == 0))
				System.out.print(i + " ");

		}
	}

	public void sum(int num) {
		int res = 0;
		for (int i = 1; i < num + 1; i++) {
			res = res + i;
		}
		System.out.print(res + " ");
	}

	public void table(int num) {
		for (int j = 1; j < num+1; j++) {
			System.out.println("table of " + j);
		for(int i = 1; i <11; i++) {
			System.out.println(i + " * " + j + " =" + i*j +" ");
		}
		System.out.println("");
	}
}

	
	public void factorial(int num) {
		int res = 1;
		if (num == 0 || num == 1) {
			System.out.println("1");
		}
		else {
			for(int i = 1; i < num+1; i++) { 
				res = res * i;
		}
			System.out.println(res);
			
	}
}
	
	public void stop100(int num) {
		int res = 0;
		for (int i = 1; i < num + 1; i++) {
			res = res + i;
			if (res >= 100) {
				System.out.println(res);
				return;
			}
		}
		System.out.print(res + " ");
	}
	
	
	public void stop999(int num) {
		int res = 0;
		for (int i = 1; i < num + 1; i++) {
				res = res + i;
				if(num > 998) {
					return;
				}
				
			}
			System.out.println("the sum is " + res);
			System.out.println("the smallest num is " + 1);
			System.out.println("the biggest num : " + num);
			
		}
	
	
	public void diagonal(int num) {
		for(int k = 1; k < num +1; k++) {
		for (int i = 1; i < num+1; i++) {
			System.out.print(i + " ");
			}
		System.out.println(" ");
		}
	}
	
	
	
	
	}

		
	
	
	

