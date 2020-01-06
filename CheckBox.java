package ui;

public class CheckBox extends TextBox {
	String text;
	CheckBox(String u){
		text = u;
	}
	public String toString(){
		return text;
	}
	@Override
	public void show() {
		System.out.println(text);
		// TODO Auto-generated method stub
		
	}

}
