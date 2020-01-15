package ui;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) {
		GenericList<Integer> m = new GenericList<Integer>(2);
		m.add(230);
		m.add(640);
		int r = m.get(0);
		System.out.println("  "+r + "  ");
		
		/*List list = new List(5);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		int index0 = list.get(0);
		int index3 = list.get(3);
		//System.out.println(index0 + "  "  +index3);
		Public p= new Public(5);
		Public m = new Public("Madhu");
		Public r = new Public("Sudha");
		Public ma = new Public("San");
	
		p.add(m);
		p.add(r);
		p.add(ma);
		Public res = p.get(0);
		Public res2 = p.get(2);
		System.out.println(res + "  "  +res2);
		
		
		
		
		
		
		
		
		
		Courses c = new Courses();
		String m = c.result("HISTORY");
		// System.out.println(m);
		Map<String, String> map = new HashMap<String, String>();
		map.put("History", "I love history.......");
		map.put("English", "value1 is good and english");
		map.put("math", "value2 is math");
		map.put("key3", "value3");
		String res = c.hashing(map, "History");
		String u = map.get("History");

		System.out.println(res);
		
		 * Point p1 = new Point(1, 2); Point p2 = new Point(1, 2); //comparison
		 * between object values boolean res = p1.equals(p2);
		 * System.out.println(res); //comparison between memory location
		 * System.out.println(p1 == p2); System.out.println(p1.hashCode());
		 * System.out.println(p1.hashCode()); //TextBox box1 = new TextBox();
		 * //System.out.println(box1); //TextBox box2 = new TextBox(); //int
		 * box2hash = box1.hashCode(); //int box1hash= box2.hashCode();
		 * //boolean res = box1.equals(box2);
		 * //System.out.println("box1 and box2 are same  "+res);
		 * //System.out.println("box1hash is "+box1hash);
		 * //System.out.println("box2hash is "+box2hash);
		 * //System.out.println("box1 toString method is " + box1.toString());
		 */

		/*
		 * TextBox text= new TextBox("This is a text box.");
		 * //System.out.println(text); UIcontrol m = new UIcontrol(); int h =
		 * m.hashCode(); System.out.println(h); m.DisEbaled(); TextBox box = new
		 * TextBox(); box.DisEbaled(); boolean res = box.getIsEnabled();
		 * System.out.println("IsEnabled of box is : " + res); boolean result =
		 * m.getIsEnabled();
		 * System.out.println("IsEnabled is of uicontrol is : " + result);
		 * m.setInput("pink"); System.out.println("accessing the input field " +
		 * m.input); m.MixColor(); m.Color(); m.RBG(); System.out.println(m);
		 * //CheckBox check = new CheckBox("This is a check box.");
		 * //System.out.println(check);
		 */

	}
}
