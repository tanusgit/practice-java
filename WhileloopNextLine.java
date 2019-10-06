input:
    Hello world

    I am a file

    Read me until end-of-file.

output:
1 Hello world

2 I am a file

3 Read me until end-of-file.






import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner input = new Scanner(System.in);
        String inputString;
        //read all the line in for loop only, dont take input outside otherwise the 
        //first line won't be printed
        //nextLine method only works for scanner object
        //increment i inside loop but assign value to i outside loop
            int i = 1;
        while(( inputString = input.nextLine()) != null){
                System.out.println(i + " " + inputString );
                i= i +1;
             }
        }
        catch(NoSuchElementException e){

        }
        
    }
}

