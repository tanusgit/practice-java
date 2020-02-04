package loop;

public class PrintFactorial {
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
}
