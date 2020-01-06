package ui;

public abstract class  TextBox {
	String text;
	int show = 5;
	TextBox(){
		System.out.println("printing textbox");
	}
	TextBox(String u){
		text = u;
	}
	public abstract void show();
	public String toString(){
		return text;
	}

}
