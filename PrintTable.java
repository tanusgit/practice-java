package loop;

public class PrintTable {
	public void table(int num) {
		for (int j = 1; j < num+1; j++) {
			System.out.println("table of " + j);
		for(int i = 1; i <11; i++) {
			System.out.println(i + " * " + j + " =" + i*j +" ");
		}
		System.out.println("");
	}
}
}
