package linklist;

public class Card {

	
	String rank[] = {"Ace", "two", "three", "four", "Five", "six", "seven", "eight",
			"nine", "ten", "jack", "queen", "king"};
	
	String suit[] = {"Black clubs", "Red diamonds", "Red hearts", "black pades"};
	
	String card[];
	//int m[][] = new int[3][4] present array with 3 row and 4 column
	Card(){
		card = new String[13];
		for (int k = 0; k < 4; k++) {
			for (int i = 0; i <13; i++) {
				card[i] =   rank[i] + " of " + suit[k] + " ";
				//System.out.println(card[i]);
										}
			}
	}
	
	public void suffle() {
		card = new String[13];
		for (int k = 0; k < 4; k++) {
			for (int i = 0; i <13; i++) {
				card [i]=  rank[(int) (Math.random()*13)] + " of " + suit[(int) (Math.random()*4)] + " ";
				System.out.println(card[i]);
										}
									}
		
	}

}
