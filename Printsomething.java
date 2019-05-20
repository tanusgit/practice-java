package linkedlist;

public class Printsomething {
	public static void main (String args[]){
		/*
		for (int j = 1; j<11; j++){
			for(int i = 1; i <11; i++){
				int s = j *i;
				System.out.print("Table of " + j + ": " + j +"*"+i+ " = " +s + " "+"\n");
			}
		}
		*/
		/*for (int n = 1; n <6; n++){
			String s = "*";
			for (int m = 1; m <5; m++){
				System.out.print(s);
			}
			System.out.print("\n");
		}
		for (int i = 1; i < 5; i ++){
			String s = "*";
			if(i == 1){
				System.out.println(s);
			}
			else if (i == 2 ){
				System.out.println(s + s);	
			}
			else if (i == 3 ){
				System.out.println(s + s + s);	
			}
			else if (i == 4 ){
				System.out.println(s + s + s +s);	
			}
			else {
				System.out.println(s + s + s +s + s);
			}
		
	}*/
		for (int n = 1; n <6; n++){
			String s = "*";
			for (int m = 1; m<=n; m++){
				System.out.print(s);
			}
			System.out.print("\n");
		}
		
}
}
