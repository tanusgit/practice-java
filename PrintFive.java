package loop;

public class PrintFive {
	public void printFive(int num) {
		for (int k = 1; k < num + 1; k++) {
			for (int i = 1; i < k + 1; i++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}
	

}
