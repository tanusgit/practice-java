import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner m = new Scanner(System.in);
        int inputint = m.nextInt();
        String inputa = m.nextLine();

        //System.out.print(input + "  ");
        for (int i = 0; i < inputint; i++){
            int index = 0;
            String s = "";
            String p = "";
            String input = m.nextLine();
            //taking each element of string
            for(char ch: input.toCharArray()){
                //taking index number of each element in a String
                //observing if the index is even or not
                //if even making a string
                //charAt() returns the char element of the given index position
                if((index%2) == 0){
                    s = s + input.charAt(index);
                }
                else if((index%2)!= 0){
                    p = p + input.charAt(index);;
                } 
                ++index;
           }
           System.out.println(s + " " + p);
        }
    }
}

