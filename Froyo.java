package linklist;

import java.util.Scanner;

public class Froyo {
	private final int freeStamps = 7;
	Scanner m = new Scanner(System.in);
	int totalStamps = 0;

	public void freeFroyo() {
		int num = 0;
		int total = 0;
		System.out.println("P: process\n" + "S: shutdown");
		String input = m.nextLine();
		while (true) {
			if (input.equalsIgnoreCase("S")) {
				break;
			} else {
				if(input.equalsIgnoreCase("P")) {
				System.out.println("How many yogurt do you want to buy?");
				totalStamps = m.nextInt();
				System.out.println("you earned " + totalStamps + " free stamps");
				while (true) {
					System.out.println("P: process\n" + "S: shutdown");
					if (input.equalsIgnoreCase("S")) {
						break;
					} else {
						System.out.println("How many yogurt do you want to buy?");
						num = m.nextInt();
						total = total + num + totalStamps;
						System.out.println("you earned " + total + " free stamps");
						if (total == 7) {
							System.out.println("you earned a free yogurt");
						}
					}
				} // end of second while loop
			}
		}
	}
}
}

/*
 * System.out.
 * println("Please enter your choice to start the transaction: either" +
 * " p to process or s to shutdown"); String input = m.next(); res =
 * input.toUpperCase(); if(res.equals(shutdown)){ return; } else if
 * (res.equals(process)) {
 * System.out.println("How many yogurt do you want to buy?"); int numOfYogurt =
 * m.nextInt(); System.out.println("Thank you. You earned " + numOfYogurt +
 * " free stamps"); if(numOfYogurt == freeStamps) {
 * System.out.println("you have earner a free stamps. Do you want a free" +
 * " yougurt? Press y for yes and n for no"); String confirm = m.next();
 * if(confirm.equalsIgnoreCase("y") == true){ totalStamps = numOfYogurt -
 * freeStamps;
 * 
 * } else if(confirm.equalsIgnoreCase("n") == true){
 * System.out.println("you have " + numOfYogurt + " free stamps");
 * 
 * }
 * 
 * } while(true) { System.out.
 * println("Please enter your choice to start the transaction: either" +
 * " p to process or s to shutdown"); String input2 = m.next(); res =
 * input2.toUpperCase(); if(res.equals(shutdown)){ break; }
 * 
 * 
 * } }
 * 
 * }
 */

//}
