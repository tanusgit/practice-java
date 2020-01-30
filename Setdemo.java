package linklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setdemo {
	public static void show() {
		/*Set<String> set = new HashSet<>();
		//set interface does not gurantee the order of items in the set. It also 
		//does not allow any duplicate value in the set.
		set.add("Rose");
		set.add("is");
		set.add("red");
		set.add("red");
		System.out.println(set);
		Collection<String> col = new ArrayList<>();
		Collections.addAll(col, "rose", "is", "red" ,"red");
		System.out.print(col);
		//to remove the duplicate we can put the collection
		//in a set
		Set<String> m = new HashSet<>(col);
		System.out.print(m);*/
		//Arrays.asList("a", "b", "c") creates a list with items a, b ,c
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c");
		//Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c")); is same as 
		//creating a list and adding elements a b c
		Set<String> set1 = new HashSet<>(list);
		Set<String> set2 = new HashSet<>(Arrays.asList("c", "b", "d", "e", "f"));
		//set has four operations like union, which gives all the elements of both sets
		//set1.addAll(set2);
		//System.out.print(set1);
		//another operation is intersection which gives the common elements of both sets
		//intersection
		//set1.retainAll(set2);
		//System.out.print(set1);
		//difference remove everything from set2 in set1 and keep the rest
		set1.removeAll(set2);
		System.out.print(set1);
	}

}
