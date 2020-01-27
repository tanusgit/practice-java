package linklist;

public class Card {
	
	
	enum suit {
		Clubs, Diamonds, hearts, Spades;
	}
	char value;
	suit s;
	boolean errorflag;
	String res;
	
	Card(){
		res = "A, Spades";
		System.out.println(res);
	}
	
	Card(char v, suit s){
		value = v;
		this.s = s;
		System.out.println(value + ", " + s);
	}
	
	
	
	
	
	

	
	/*String rank[] = {"Ace", "two", "three", "four", "Five", "six", "seven", "eight",
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
	*/

}
