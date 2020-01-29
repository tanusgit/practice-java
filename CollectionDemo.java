package linklist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
	public static void show() {
	Collection<String> col = new ArrayList<>();
	Collections.addAll(col, "Nila", "sila", "Minu");
	col.add("Ranu");
	col.add("Panu");
	for (String item : col) {
		System.out.println(item);
		}
	System.out.println(col.contains("Panu"));
	System.out.println(col.size());
	col.remove("Nila");
	System.out.println(col);
	System.out.println(col.size());
	col.clear();
	System.out.println(col.isEmpty());
	System.out.println(col.contains("Panu"));
	//to convert collect to a string or int array, pass 0 so that we dont have to worry 
	//about the size of the array
	String[] arr = col.toArray(new String[0]);
	
	List<Integer> m = new ArrayList<>();
	Collections.addAll(m, 1, 2, 4, 3,3 ,5, 6, 3);
	System.out.println(m);
	System.out.println(m.indexOf(2));
	System.out.println(m.contains(5));
	System.out.println(m.indexOf(3));
	System.out.println(m.lastIndexOf(3));
	//shows the item from index zero to 7 but excluding 7
	System.out.println(m.subList(0, 7));
	
	}

}
