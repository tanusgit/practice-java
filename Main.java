package ui;

public class Main {
public static void main(String args[]){
	///*TextBox  text= new TextBox("This is a text box.");
	//System.out.println(text);
	UIcontrol m = new UIcontrol();
	m.setInput("pink");
	System.out.println("accessing the input field " + m.input);
	m.MixColor();
	m.Color();
	m.RBG();
	System.out.println(m);
	//CheckBox check = new CheckBox("This is a check box.");
	//System.out.println(check);
	
}
}
