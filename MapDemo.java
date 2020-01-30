package linklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void show() {
	//List<Customer> customers = new ArrayList();
	//string is the key and customer is the value
		Customer c1 = new Customer("Nina", "gmail");
		Customer c2 = new Customer("Rina", "ymail");
		Customer c3 = new Customer("Tina", "hmail");
	Map<String, Customer> map = new HashMap<>();
	//put customer in map by using put()
	//customer email is the key here and customer iteself is the value here
	map.put(c1.getEmail(), c1);
	map.put(c2.getEmail(), c2);
	map.put(c3.getEmail(), c3);
	
	//to get the customer we use get method and give it the key 
	Customer c = map.get("gmail");
	//System.out.print(c);
	//map has functions like replace and containskey
	//it also has a getOrDefault() which return the default value if the key does not exist
	Customer d = new Customer("Unknown", "kk");
	Customer c4 = map.getOrDefault("rk", d);
	Customer c5 = map.get("rk");
	
	//System.out.println(c5);
	//System.out.print(map);
	//map cannot be iterable but it has entrySet() and keySet() which can be iterable
	for (Entry<String, Customer> n : map.entrySet()) {
		//System.out.println(n);
		//we can call getValue() and getKey() to print the key and value of the map
		//System.out.println(n.getValue());
		//System.out.println(n.getKey());
	}
	//to get the values only from the HashMap we can directly call the values()
	//but we need to store the values in customer type as our value is customer type in 
	//our hashmap
	for (Customer na : map.values()) {
		System.out.println(na);
		
	}
	
	}
}
