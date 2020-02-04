package loop;

public class PrintStop100 {
	public static void printinorder(int num) {
		int count = 1;
		for (int j = 1; j <= num; j++) {
			for (int i = 1; i <= num; i++) {
				System.out.print(count++);
			}
			System.out.println(" ");
		}

	}

	public static void stop100(int num) {
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

	public static void stop999(int num) {
		int res = 0;
		for (int i = 1; i < num + 1; i++) {
			res = res + i;
			if (num > 998) {
				return;
			}

		}
		System.out.println("the sum is " + res);
		System.out.println("the smallest num is " + 1);
		System.out.println("the biggest num : " + num);

	}

}
