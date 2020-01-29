package linklist;

public class Customer implements Comparable<Customer>{
	private String name;
	
	
	Customer(String n){
		name = n;
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Customer other) {
		// we cannot directly compare between two customers because we need integer
		//value to compare
		return name.compareTo(other.name);
		
	}



}


