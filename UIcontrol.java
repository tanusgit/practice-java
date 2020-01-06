package ui;
/*
 * If we do not call setInput function on UIcontrol object then default
 * constructor of UIcontrol would set the color as red. But if we set
 * the color by calling setInput function then that color would be set.
 * If we put a color in default constructor then that color would appear 
 * while making an UIcontrol object otherwise input field's color would
 * appear
 */
public class UIcontrol implements Color {
	String input = "yellow";
	int show;
	UIcontrol(){
		input = "red";
	}
	public String setInput(String u){
		input = u;
		return input;
	}
	UIcontrol(String u){
		input = u;
	}
	public int show(){
		return show;
	}
	public String toString(){
		return input;
	}
	@Override
	public void Color() {
		//Color function should print red if setInput() is not called
		//		
		System.out.println("input: "+input);
		
	}
	@Override
	public void RBG() {
		System.out.println("RBG is "+Color.RBG);
		
		
	}
	@Override
	public void MixColor() {
		System.out.println("Mixcolor "+Color.color);
		
	}

}
