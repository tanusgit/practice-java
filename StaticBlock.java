import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code her
static int B;
static int H;
static boolean flag;

static {
    Scanner scanner = new Scanner(System.in);
    B = scanner.nextInt();
    H = scanner.nextInt();
    flag = B > 0 && H > 0;
    if(!flag) {
        // probably not what they intended
        System.out.println("java.lang.Exception: Breadth and height must be positive");        
    }
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

