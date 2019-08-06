package insertionSort;

public class Insertion {
	public static void main (String args[]){
		int[] numbers = {5, 8, 6, 4, 2, 1, 3,7};
		int[] sortedNumbers = InsertionSort(numbers);
		for(int i = 0; i < sortedNumbers.length; i++){
			System.out.println(sortedNumbers[i]);
		}
	}
public static int[] InsertionSort(int[] a){
	int key;
	int j;
	for (int i = 1; i < a.length; i++){
		 key = a[i];
		j = i-1;
		while(j >= 0 && a[j]>key){//in first iteration key is 5 and a[j] is 9
			a[j+1]= a[j]; //9>5 so goes to this line
			j--; // decrement j to get out of the loop and j becomes -1
		}
		a[j+1] = key; // now keep 5 in 0 position. and -1+1 is 0
		//if key is greater than a[j] then key remains in the original position 
		// in a[i] as key was in a[i]
	}
	
	return a;
}
}
