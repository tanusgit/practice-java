package ciper;

public class CaesarCipher {
public static void main(String args[]){
	int a = ' ';
	int shift = 2;
	//System.out.print(a);
	String n = "this is a bag";
	//toString(n);
	//print(n);
	EncryptNew(n,2);
	
	//String re = Encrypt(n, 2);
	//System.out.print(re);
}
public static void print(String msg){
	for(char m : msg.toCharArray()){
		System.out.print(m);
		if((int)m == 32){
			System.out.print("\n");	
		}
	}
}
public static void EncryptNew(String msg, int shift){
	for(char m : msg.toCharArray()){
		int Intm = (int)m;
		char a = 'a';
		if(Intm >= (int)a){
		Intm = Intm + shift;
		}
		System.out.print((char)Intm);
		if((int)m == 32){
			System.out.print("\n");	
		}
	}
}

	













public static String Encrypt(String msg, int s){
		char p;
		StringBuilder result = new StringBuilder();
		for(char Newsmall : msg.toCharArray()){
			if((int)Newsmall >= (int)('a') && (int)Newsmall <= (int)('z')){
				p = ((char)(((int)Newsmall)+ s));
			}
			else p = (Newsmall);
			if((int)Newsmall >= (int)('A') && (int)Newsmall <= (int)('Z')){
				p = ((char)(((int)Newsmall)+ s));
			}
			else p = (Newsmall);
			
			result.append(p);
		}
		//making stringbuilder to string by invoking tostring method
		return result.toString();
	}
	
	public static String toString(String s){
		String result = "";
		StringBuilder sbi = new StringBuilder(result);
		for(char Newsmall : s.toCharArray()){
			//appending each char value in string s
			//for(int i = 0; i < s.length(); i++){
				//if(s.charAt(i) == ' '){
				if((int)Newsmall == 32){
				System.out.println(sbi.append(Newsmall));
				}
				System.out.print(sbi.append(Newsmall));
			}
		//}
		return sbi.toString();
	}
}
	//for each loop to print all the element of an array
	//for(char Newsmall : n.toCharArray()){
	//System.out.println((char)(((int)Newsmall)+ shift));
	//}
	
	/*char c = n.charAt(0);//gives the value at index 0 in a string
	int p = c; // convert the value in int
	int result = p + 2;
	char newchar = (char) result;// converts the int value to char
	//System.out.print(newchar);
	StringBuffer am = new StringBuffer("I love dogs");// We need StringBuffer to append
	//something to a string
	am.append("dd");
	//System.out.print(am);
	String message = "a";
	caesarCipher(message, 2);
	
	
						
}
public static void caesarCipher(String message, int shiftAmount) {
    // for each character, c in message:
    //   if c >= 'a' and <= 'z'
    //     shift c by shiftAmount
    //   else if c >= 'A' and <= 'Z'
    //     shift c by shiftAmount
    // add c to output
	//StringBuffer newMessage = new StringBuffer();
	for(int i =0; i < message.length()-1; i ++ ){
		char c = message.charAt(i);
		int IntC = c;
		int Inta = 'a';
		int Intz = 'z';
		int IntA = 'A';
		int IntZ = 'Z';
		if(IntC >= Inta && IntC <=Intz){
			IntC = IntC + shiftAmount;
			char value = (char)IntC;// casting char to convert int to a char 
			System.out.println(value);
		}
		if(IntC >= IntA && IntC <=IntZ){
			IntC = IntC + shiftAmount;
			char value = (char)IntC;
			System.out.println(value);
		}
		
	}
	//return newMessage.append(value);
																	
}
public static void Printchar(String message, int shift){
		for (int i = 0; i < message.length()-1; i++){
			char c = message.charAt(i);
			System.out.println(c);
			int Intc = c;
			
		}
	}*/

