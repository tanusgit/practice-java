package object;

public class NewObject {
	double res;
	String product = "";
	String brand = "";
	double price = 0;
	double discount = 0;
	
	
	public static void callingAllMethods(){
	int a = add(3, 2);
	int s =	sub(3, 2);
	int m =	multi(3, 2);
	int d =	div(3, 2);
	System.out.println("addition: " + a + "\n" + "subtraction: " + s + "\n"+
	"multiplication: " + m + "\n" + "division: " + d);
	}
	
public static int add(int a, int b) {
	return a * b;
}
	
public static int sub(int a, int b) {
	return a - b;
}
	
public static int multi(int a, int b) {
	return a * b;
}

public static int div(int a, int b) {
	return a/b;
}


public double productDiscount(String a, String b, double price, double discount) {
	product = a;
	brand = b;
	this.price = price;
	this.discount = discount;
	res = price- ((discount * price)/100);
	return res;
	
}

	
}
