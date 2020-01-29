package linklist;

public class Customer implements Comparable<Customer>{
	private String name;
	private String email;
	
	
	Customer(String n, String e){
		name = n;
		email = e;
	}
	public String toString() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	@Override
	public int compareTo(Customer other) {
		// we cannot directly compare between two customers because we need integer
		//value to compare. we are comparing customers based on their name only which is
		//not ideal so we will implement comparator interface
		return name.compareTo(other.name);
		
	}



}


