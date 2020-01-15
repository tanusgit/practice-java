package ui;

public class GenericList<E>{
	//created an arraylist of E type
	private E[] items;
	private int count;
//default constructor to create an arraylist of size of num
	GenericList(int num){
		//cannot instantiate E type directly so we need to create arraylist
		//of object type then we can type cast it to E[]type
		items = (E[])new Object[num];
	}
	//adding a value of E type
	public void add (E value){
		//initially count is zero, next time when we increment the count we 
		//will store the value in index 1 of array items
		items[count++] = value;
	}
	//returning a value of E type from the given index 
	public E get(int index){
		return items[index];
	}

}
