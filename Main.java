package linklist;
import java.util.*;
import javax.swing.*;

import linklist.Card.suit;
//import java.util.LinkedList;
public class Main {
	public static void main(String args[]) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("Mina"));
		list.add(new Customer("Cina"));
		list.add(new Customer("Bina"));
		list.add(new Customer("Aina"));
		System.out.println(list);
		//we need to implement comparable interface in customer class to call the sort
		//method and compare between two customer objects
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		/*CollectionDemo.show();
		
		
		/*GenericList<String> m = new GenericList<String>();
		 
		m.add("Mina");
		m.add("kina");
		
		for ( String n : m) {
			System.out.println(n);
		}
		
		
		
		/*JFrame frame = new JFrame();
		JButton button = new JButton("click");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add button to the frame's content pane
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
		/*
		 * 
		
		
		
		
		/*Iterator i = m.iterator();
		while((i).hasNext()) {
			Object k =  (i).next();
			System.out.print(k);
		}
		
		
		
		
		/*m.add("rif");
		m.add("nit");
		for(Object n: m.items) {
			System.out.println(n);
		}
		
		
		/*Card m = new Card();
		//to insert enum value in constructor we need to call the enum type before the 
		//value
		Card mn = new Card('T', suit.Diamonds);
		
		
		Card m = new Card();
		m.suffle();
		
		int mo = (int) (Math.random()*11);
		System.out.print(mo);
		
		
		
		TaxCalculator2018 n = new TaxCalculator2018(205000);
		TaxReport k = new TaxReport(n);
		k.show();
		
		
		TaxReport r = new TaxReport();
		r.show();
		LinkedList list = new LinkedList();
		//list.addFirst(5);
		//list.addLast(6);
		//list.addLast(3);
		//list.addLast(2);
		//list.addLast(7);
		list.addLast(6);
		//list.removeFirst();
		try {
		System.out.println(list.toString());
	}catch(NullPointerException e) {
		
	}*/
	}
}
