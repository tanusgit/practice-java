package linklist;

import java.util.Comparator;

public class Emailcomparator implements Comparator<Customer>{

	@Override
	public int compare(Customer a, Customer b) {
		// TODO Auto-generated method stub
		return a.getEmail().compareTo(b.getEmail());
		
	}

}
