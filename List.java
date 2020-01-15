package ui;

public class List {
private int[] items;
private int count;

List(int num){
	items = new int[num];
}
public void add (int value){
	//initially count is zero, next time when we increment the count we 
	//will store the value in index 1 of array items
	items[count++] = value;
}
public int get(int index){
	return items[index];
}
}
