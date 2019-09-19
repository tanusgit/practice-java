public class GuessingGame {
	public static void main (String args[]){
		guessGame();
		
		
	}
	
	public static void guessGame()
	{
		int secretnum = 5;
		Scanner m = new Scanner(System.in);
		System.out.print("Please guess a number ");
		int num = m.nextInt();
		if (num == secretnum)
		{
			System.out.print("congradulations! You guessed the number.");
		
		}
		
		while(num != secretnum)
		{
			Scanner newsc = new Scanner(System.in);
			System.out.print("wrong guess. Please guess a number again ");
			int num2 = newsc.nextInt();
			if (num2 == secretnum)
			{
				System.out.print("congradulations! You guessed the number.");
				break;
			}
		}
	}
	
	
}	
