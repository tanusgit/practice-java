package attendence;
import java.util.ArrayList;

public class Student {
	private int age;
	private int roll;
	private String name;
	Student(String name, int age, int roll){
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	Student(String name2, String string, String string2) {
		name = name2;
		age = Integer.parseInt(string);
		roll = Integer.parseInt(string2);
	}
	//this array represents the whole year 365 days in a year
	int[] theWholeYear = new int[365];
	public void setAbsent(int m){
		theWholeYear[m] = 0;
	}
	public void setPresent(int m){
		theWholeYear[m] = 1;
	}

	public String toString(){
		String s =  name +","+age +","+ roll;
		for(int i =0; i <theWholeYear.length; i++){
			if(theWholeYear[i] == 0){
			 s = s + ","  + "absent";
			}
			else if (theWholeYear[i] == 1){
				s =  s + "," + "present";
			}
		}
		return s;
	}
	
	
}
