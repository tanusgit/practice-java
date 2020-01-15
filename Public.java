package ui;

public class Public {
private Public[] name;
private String nam;
private int age;
private int money;
private int count =0;
String Lastname;
//taking num to make that many public objects in the name array
Public(int num){
	name = new Public[num];
	
}
Public(String name){
	age = 51;
	money = 50000000;
	nam = name;
}
public String toString(){
	return age +" " + money +" "+ nam;
}
public void add (Public value){
	//initially count is zero, next time when we increment the count we 
	//will store the value in index 1 of array items
	name[count++] = value;
}
public Public get(int index){
	return name[index];
}
}

