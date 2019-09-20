import java.util.Scanner;
public class GuessGame{
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
			System.out.print("wrong guess. Please guess a number again ");
			num = m.nextInt();
		}
		System.out.print("congratulations! You guessed the number.");
	}
	
	
}	
