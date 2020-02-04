package loop;

public class Print123 {
	
	public void Print123N(int num) {
		//printing k as k decides what to print
		for(int k = 1; k < num +1; k++) {
		for (int i = 0; i < k; i++) {
			System.out.print(k);
		}
			
		System.out.println(" ");
		}
	}

}
